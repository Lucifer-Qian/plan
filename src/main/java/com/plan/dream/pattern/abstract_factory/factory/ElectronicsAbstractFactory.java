package com.plan.dream.pattern.abstract_factory.factory;

import com.plan.dream.pattern.abstract_factory.product.AbstractNoteBook;
import com.plan.dream.pattern.abstract_factory.product.AbstractPhone;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.abstract_factory.product
 * @ClassName: ElectroniceAbstractFactory
 * @author: Rocky Qian
 * @description:
 * @date: 2023/10/27 12:22
 * @version: 1.0
 */
public interface ElectronicsAbstractFactory {

    /**
     * 生产phone
     *
     * @param
     * @return com.plan.dream.pattern.abstract_factory.product.AbstractPhone
     * @throws
     * @method createPhone
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/10/27 12:24
     */
    AbstractPhone createPhone();

    /**
     * 生产notebook
     *
     * @param
     * @return com.plan.dream.pattern.abstract_factory.product.AbstractNoteBook
     * @throws
     * @method createNoteBook
     * @author Rocky Qian
     * @version 1.0
     * @date 2023/10/27 12:25
     */
    AbstractNoteBook createNoteBook();
}
