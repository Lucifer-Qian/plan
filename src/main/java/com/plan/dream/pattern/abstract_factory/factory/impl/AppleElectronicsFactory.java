package com.plan.dream.pattern.abstract_factory.factory.impl;

import com.plan.dream.pattern.abstract_factory.product.AbstractNoteBook;
import com.plan.dream.pattern.abstract_factory.product.AbstractPhone;
import com.plan.dream.pattern.abstract_factory.factory.ElectronicsAbstractFactory;
import com.plan.dream.pattern.abstract_factory.product.impl.AppleNoteBook;
import com.plan.dream.pattern.abstract_factory.product.impl.ApplePhone;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.abstract_factory.product.impl
 * @ClassName: AppleElectronicsFactory
 * @author: Rocky Qian
 * @description:
 * @date: 2023/10/27 12:25
 * @version: 1.0
 */
public class AppleElectronicsFactory implements ElectronicsAbstractFactory {
    @Override
    public AbstractPhone createPhone() {
        return new ApplePhone();
    }

    @Override
    public AbstractNoteBook createNoteBook() {
        return new AppleNoteBook();
    }
}
