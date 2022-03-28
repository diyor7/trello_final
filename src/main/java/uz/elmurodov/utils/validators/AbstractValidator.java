package uz.elmurodov.utils.validators;

import uz.jl.utils.BaseUtil;

public abstract class AbstractValidator {
    protected final BaseUtil utils;

    protected AbstractValidator(BaseUtil utils) {
        this.utils = utils;
    }
}
