package ru.ipt.fastapi;

import org.openapitools.codegen.languages.PythonAbstractConnexionServerCodegen;

import static org.openapitools.codegen.utils.StringUtils.camelize;


public class FastapiGenerator extends PythonAbstractConnexionServerCodegen {
    public FastapiGenerator() {
        super("fastapi", false);
        embeddedTemplateDir = templateDir = "fastapi";
        apiTestTemplateFiles().clear();
        supportingFiles.clear();
        apiTemplateFiles.clear();
        apiTemplateFiles.put("rest.mustache", "_rest.py");
        apiTemplateFiles.put("controller.mustache", "_controller.py");
    }

    @Override
    public String getName() {
        return "fastapi";
    }

    @Override
    protected void addSupportingFiles() {
        supportingFiles.clear();
    }

    @Override
    public String toApiName(String name) {
        if (name == null || name.length() == 0) {
            return "DefaultController";
        }
        return camelize(name, false);
    }
}

