package com.sk.android.skbutterknife.iface;

import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.sk.android.skbutterknife.model.Element;

import java.util.ArrayList;


public interface IConfirmListener {

    void onConfirm(Project project, Editor editor, ArrayList<Element> elements, String fieldNamePrefix, boolean createHolder, boolean moduleR, boolean splitOnclickMethods);
}
