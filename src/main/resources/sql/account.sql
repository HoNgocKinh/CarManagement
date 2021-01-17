INSERT INTO account(`id`, `username`, `password`, `permissions`, `roles`, `user_info_id`) VALUES
(1, 'admin', 'admin', 'READ,WRITE,UPDATE,DELETE', 'ADMIN, MANAGER', 10),
(2, 'manager1', 'm123123', 'READ,WRITE,UPDATE,DELETE', 'MANAGER', 5),
(3, 'manager2', 'm123123', 'READ,WRITE,UPDATE,DELETE', 'MANAGER', 4),
(4, 'staff1', 's123123', 'READ,UPDATE', 'STAFF', 12),
(5, 'staff2', 's123123', 'READ,UPDATE', 'STAFF', 13);