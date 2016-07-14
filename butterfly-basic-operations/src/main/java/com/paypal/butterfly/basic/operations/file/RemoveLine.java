package com.paypal.butterfly.basic.operations.file;

import com.paypal.butterfly.extensions.api.TransformationContext;
import com.paypal.butterfly.extensions.api.TransformationOperation;

import java.io.File;

/**
 * Operation to remove one, or more, lines from a text file
 *
 * @author facarvalho
 */
public class RemoveLine extends TransformationOperation<RemoveLine> {

    private static final String DESCRIPTION = "Remove line(s) matching '%s' from file %s";

    private String regex;

    public RemoveLine() {
    }

    /**
     * Operation to remove one, or more, lines from a text file
     *
     * @param regex the regular expression to identify the line(s) to be removed
     */
    public RemoveLine(String regex) {
        this.regex = regex;
    }

    public RemoveLine setRegex(String regex) {
        this.regex = regex;
        return this;
    }

    public String getRegex() {
        return regex;
    }

    @Override
    public String getDescription() {
        return String.format(DESCRIPTION, regex, getRelativePath());
    }

    @Override
    protected String execution(File transformedAppFolder, TransformationContext transformationContext) throws Exception {
        // TODO

        return null;
    }

}
