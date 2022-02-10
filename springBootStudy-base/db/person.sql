CREATE TABLE `person`
(
    `id`   VARCHAR(50) NULL DEFAULT NULL COMMENT '主键' COLLATE 'utf8mb4_general_ci',
    `name` VARCHAR(50) NULL DEFAULT NULL COMMENT '名称' COLLATE 'utf8mb4_general_ci',
    `age`  INT(10) NULL DEFAULT NULL COMMENT '年龄',
    `sign` INT(10) NULL DEFAULT '0' COMMENT '逻辑删除标识'
) COMMENT='人物信息'
COLLATE='utf8mb4_general_ci'
ENGINE=InnoDB
;
