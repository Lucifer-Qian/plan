package com.plan.dream.pattern.builder.builder2;

import java.util.Date;

/**
 * @ProjectName: dream
 * @Package: com.plan.dream.pattern.builder.builder2
 * @ClassName: TodoWorkBuilder
 * @author: Rocky Qian
 * @description:
 * @date: 2023/10/27 15:58
 * @version: 1.0
 */
public class TodoWorkBuilder {

    private TodoWorkBuilder(Builder builder) {
    }

    public static class Builder {
        private Long id;

        private Integer type;

        private Long eventId;

        private Integer plazaId;

        private Integer storeId;

        private Integer bindType = 1;

        private Integer roleType;

        private Long userId;

        private String content;

        private String startDate;

        private Date createTime;

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setType(Integer type) {
            this.type = type;
            return this;
        }

        public Builder setEventId(Long eventId) {
            this.eventId = eventId;
            return this;
        }

        public Builder setPlazaId(Integer plazaId) {
            this.plazaId = plazaId;
            return this;
        }

        public Builder setStoreId(Integer storeId) {
            this.storeId = storeId;
            return this;
        }

        public Builder setBindType(Integer bindType) {
            this.bindType = bindType;
            return this;
        }

        public Builder setRoleType(Integer roleType) {
            this.roleType = roleType;
            return this;
        }

        public Builder setUserId(Long userId) {
            this.userId = userId;
            return this;
        }

        public Builder setContent(String content) {
            this.content = content;
            return this;
        }

        public Builder setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder setCreateTime(Date createTime) {
            this.createTime = createTime;
            return this;
        }

        public TodoWorkBuilder build() {
            return new TodoWorkBuilder(this);
        }
    }

    public void send() {
        System.out.println("构造完成");
    }

}
