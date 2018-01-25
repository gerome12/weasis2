/*******************************************************************************
 * Copyright (c) 2016 Weasis Team and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Roduit - initial API and implementation
 *******************************************************************************/
package org.weasis.touch.internal;

import java.io.File;
import java.util.concurrent.Executors;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.weasis.core.api.service.BundleTools;
import org.weasis.core.ui.docking.UIManager;

import javafx.application.Application;

public class Activator implements BundleActivator {
    private static final Logger LOGGER = LoggerFactory.getLogger(Activator.class);

    @Override
    public void start(final BundleContext bundleContext) throws Exception {
        // Starts core bundles for initialization before calling UI components
        Bundle bundle = FrameworkUtil.getBundle(BundleTools.class);
        if (bundle != null) {
            bundle.start();
        }
        bundle = FrameworkUtil.getBundle(UIManager.class);
        if (bundle != null) {
            bundle.start();
        }
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        // Let osgi services doing their job
    }

    public static void main(String[] args) {
        // Load native lib and init DICOM lib
        RenderingManager.setSystemSpecification();
        File nativLibs = new File(args[0] + File.separator + System.getProperty("native.library.spec"));
        new RenderingManager(nativLibs);

        Executors.defaultThreadFactory().newThread(() -> Application.launch(OsgiApp.class)).start();
    }
}
