package org.farhan.objects.mbtMavenPlugin.pre.stepdefs;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbtMavenPlugin.AdminFamilyDetailsResponseStepsJavaFile;

public class AdminFamilyDetailsResponseStepsJavaFileImpl extends FileObject implements AdminFamilyDetailsResponseStepsJavaFile{

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}
}
