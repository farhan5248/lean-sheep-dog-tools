package org.farhan.objects.mbtMavenPlugin.pre;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbtMavenPlugin.ApplicationTestingFeatureFile;

public class ApplicationTestingFeatureFileImpl extends FileObject implements ApplicationTestingFeatureFile {

	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}
}
