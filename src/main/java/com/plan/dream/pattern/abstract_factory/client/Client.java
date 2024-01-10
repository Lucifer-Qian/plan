package com.plan.dream.pattern.abstract_factory.client;

import com.plan.dream.pattern.abstract_factory.factory.ElectronicsAbstractFactory;
import com.plan.dream.pattern.abstract_factory.factory.impl.AppleElectronicsFactory;
import com.plan.dream.pattern.abstract_factory.product.AbstractNoteBook;
import com.plan.dream.pattern.abstract_factory.product.AbstractPhone;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.abstract_factory.client
 * @ClassName: Client
 * @author: Rocky Qian
 * @description:
 * @date: 2023/10/27 12:38
 * @version: 1.0
 */
public class Client {

    private AbstractPhone phone;
    private AbstractNoteBook noteBook;

    public Client(ElectronicsAbstractFactory factory) {
        this.phone = factory.createPhone();
        this.noteBook = factory.createNoteBook();
    }

    public AbstractPhone getPhone() {
        return phone;
    }

    public void setPhone(AbstractPhone phone) {
        this.phone = phone;
    }

    public AbstractNoteBook getNoteBook() {
        return noteBook;
    }

    public void setNoteBook(AbstractNoteBook noteBook) {
        this.noteBook = noteBook;
    }

    public static void main(String[] args) {
        Client client = new Client(new AppleElectronicsFactory());
        final AbstractPhone phone = client.getPhone();
        final AbstractNoteBook noteBook = client.getNoteBook();
        System.out.println(phone);
        System.out.println(noteBook);
    }
}
