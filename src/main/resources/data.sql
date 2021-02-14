INSERT INTO sys_resource(resource_id,resource_name,resource_url,resource_operation,resource_type,order_by) VALUES (12, '添加资源', '/sys/resource/save', 'sys.resource.save', 1, 1);
INSERT INTO sys_resource(resource_id,resource_name,resource_url,resource_operation,resource_type,order_by) VALUES (13, '修改资源', '/sys/resource/update', 'sys.resource.update', 1, 8);
INSERT INTO sys_resource(resource_id,resource_name,resource_url,resource_operation,resource_type,order_by) VALUES (14, '删除资源', '/sys/resource/delete', 'sys.resource.delete', 1, 2);
INSERT INTO sys_resource(resource_id,resource_name,resource_url,resource_operation,resource_type,order_by) VALUES (15, '查看资源', '/sys/resource/query', 'sys.resource.query', 1, 3);
INSERT INTO sys_resource(resource_id,resource_name,resource_url,resource_operation,resource_type,order_by) VALUES (16, '添加权限', '/sys/permission/save', 'sys.permission.save', 1, 4);
INSERT INTO sys_resource(resource_id,resource_name,resource_url,resource_operation,resource_type,order_by) VALUES (17, '修改权限', '/sys/permission/update', 'sys.permission.update', 1, 8);
INSERT INTO sys_resource(resource_id,resource_name,resource_url,resource_operation,resource_type,order_by) VALUES (18, '删除权限', '/sys/permission/delete', 'sys.permission.delete', 1, 5);
INSERT INTO sys_resource(resource_id,resource_name,resource_url,resource_operation,resource_type,order_by) VALUES (19, '查看权限', '/sys/permission/query', 'sys.permission.query', 1, 6);
INSERT INTO sys_resource(resource_id,resource_name,resource_url,resource_operation,resource_type,order_by) VALUES (20, '添加角色', '/sys/role/save', 'sys.role.save', 1, 7);
INSERT INTO sys_resource(resource_id,resource_name,resource_url,resource_operation,resource_type,order_by) VALUES (21, '修改角色', '/sys/role/update', 'sys.role.update', 1, 8);
INSERT INTO sys_resource(resource_id,resource_name,resource_url,resource_operation,resource_type,order_by) VALUES (22, '删除角色', '/sys/role/delete', 'sys.role.delete', 1, 9);
INSERT INTO sys_resource(resource_id,resource_name,resource_url,resource_operation,resource_type,order_by) VALUES (23, '查询角色', '/sys/role/query', 'sys.role.query', 1, 10);
INSERT INTO sys_resource(resource_id,resource_name,resource_url,resource_operation,resource_type,order_by) VALUES (24, '添加用户', '/sys/user/save', 'sys.user.save', 1, 11);
INSERT INTO sys_resource(resource_id,resource_name,resource_url,resource_operation,resource_type,order_by) VALUES (25, '修改用户', '/sys/user/update', 'sys.user.update', 1, 12);
INSERT INTO sys_resource(resource_id,resource_name,resource_url,resource_operation,resource_type,order_by) VALUES (26, '删除用户', '/sys/user/delete', 'sys.user.delete', 1, 13);
INSERT INTO sys_resource(resource_id,resource_name,resource_url,resource_operation,resource_type,order_by) VALUES (27, '查询用户', '/sys/user/query', 'sys.user.query', 1, 14);
INSERT INTO sys_resource(resource_id,resource_name,resource_url,resource_operation,resource_type,order_by) VALUES (28, '查询分类', '/classify/query', 'classify.query', 1, 15);
INSERT INTO sys_resource(resource_id,resource_name,resource_url,resource_operation,resource_type,order_by) VALUES (29, '查询书籍', '/book/query', 'book.query', 1, 16);


INSERT INTO sys_role(role_id,role_name,role_type,order_by) VALUES (12, 'ADMIN', 0, 1);
INSERT INTO sys_role(role_id,role_name,role_type,order_by) VALUES (13, 'USER', 1, 2);

INSERT INTO sys_user(user_id,username,password,department_id,post_id,order_by) VALUES (12, 'admin', '$2a$10$uasT4Zvy0BrcSKxPGVOdeuMohuspzDRZXqgd58n.2LpzG6t8DoW62', 0, 0, 0);
INSERT INTO sys_user(user_id,username,password,department_id,post_id,order_by) VALUES (13, 'user', '$2a$10$fIk0t6E3izAL1ODh5YLCSe5etuTUJsv9a9ew3.lxslpVCOaBkwoI6', 0, 0, 1);

INSERT INTO sys_user_role(user_id,role_id) VALUES (12, 12);
INSERT INTO sys_user_role(user_id,role_id) VALUES (13, 13);

INSERT INTO sys_permission(resource_id,role_id,permission_status,order_by) VALUES (12, 12, 1, 1);
INSERT INTO sys_permission(resource_id,role_id,permission_status,order_by) VALUES (13, 12, 1, 2);
INSERT INTO sys_permission(resource_id,role_id,permission_status,order_by) VALUES (14, 12, 1, 3);
INSERT INTO sys_permission(resource_id,role_id,permission_status,order_by) VALUES (15, 12, 1, 4);
INSERT INTO sys_permission(resource_id,role_id,permission_status,order_by) VALUES (16, 12, 1, 5);
INSERT INTO sys_permission(resource_id,role_id,permission_status,order_by) VALUES (17, 12, 1, 6);
INSERT INTO sys_permission(resource_id,role_id,permission_status,order_by) VALUES (18, 12, 1, 7);
INSERT INTO sys_permission(resource_id,role_id,permission_status,order_by) VALUES (19, 12, 1, 8);
INSERT INTO sys_permission(resource_id,role_id,permission_status,order_by) VALUES (20, 12, 1, 9);
INSERT INTO sys_permission(resource_id,role_id,permission_status,order_by) VALUES (21, 12, 1, 10);
INSERT INTO sys_permission(resource_id,role_id,permission_status,order_by) VALUES (22, 12, 1, 11);
INSERT INTO sys_permission(resource_id,role_id,permission_status,order_by) VALUES (23, 12, 1, 12);
INSERT INTO sys_permission(resource_id,role_id,permission_status,order_by) VALUES (24, 12, 1, 13);
INSERT INTO sys_permission(resource_id,role_id,permission_status,order_by) VALUES (25, 12, 1, 14);
INSERT INTO sys_permission(resource_id,role_id,permission_status,order_by) VALUES (26, 12, 1, 15);
INSERT INTO sys_permission(resource_id,role_id,permission_status,order_by) VALUES (27, 12, 1, 16);
INSERT INTO sys_permission(resource_id,role_id,permission_status,order_by) VALUES (28, 12, 1, 17);
INSERT INTO sys_permission(resource_id,role_id,permission_status,order_by) VALUES (29, 12, 1, 17);

INSERT INTO sys_permission(resource_id,role_id,permission_status,order_by) VALUES (14, 13, 1, 17);
INSERT INTO sys_permission(resource_id,role_id,permission_status,order_by) VALUES (17, 13, 1, 18);
INSERT INTO sys_permission(resource_id,role_id,permission_status,order_by) VALUES (21, 13, 1, 19);

INSERT INTO classify(id, name, book_count, monthly_count, icon, order_by) VALUES ('364d6855-125c-4e95-b20c-fb2f16fd94b0', '精选', 0, 0, '/icon/精选_.png',1);
INSERT INTO classify(id, name, book_count, monthly_count, icon, order_by) VALUES ('503c4472-93c8-4d2e-8b34-aea0408ebc59', '文学', 0, 0, '/icon/文学_.png',2);
INSERT INTO classify(id, name, book_count, monthly_count, icon, order_by) VALUES ('2f390b67-3268-4f68-80fd-744c9ae9556b', '科幻', 0, 0, '/icon/科幻_.png',3);
INSERT INTO classify(id, name, book_count, monthly_count, icon, order_by) VALUES ('17c3eba1-abfa-4ac0-98d6-6cd2b973a333', '推理', 0, 0, '/icon/推理_.png',4);

INSERT INTO book(id, name, cover, long_intro, classify, author, tags, chapters_count, word_count, order_by) VALUES ('17c3eba1-abfa-4ac0-98d6-6cd2b973a333', '说岳全传', '', '是一部以岳飞抗金故事为题材、带有某种历史演义色彩的英雄传奇小说。本书所写的忠奸斗争是在南宋立国未稳、金兵大举进兵中原的特殊历史背景之下展开的。岳飞等爱国将领，力主抗战，收复失地；而秦桧为首的权奸集团，则竭力主张卖国求和。因此，爱国与卖国、抗战与投降，便成为作品中反映的忠奸斗争的具体内容。全书的主旨秉承自宋以来延续数百年的忠君爱国思想，热情讴歌岳飞及其岳家将的尽忠抗敌，保家卫国的爱国主义精神，痛斥秦桧等权奸投降卖国、残害忠良的无耻行径。集中体现这一思想精华的，就是岳飞这一形象。岳飞勇武过人，智谋卓越，忠孝节义，精忠报国，是个理想化的人物。为了一个“忠” 字，他可以置战场胜败于不顾，置身家性命于度外，慷慨就义，别无怨言。这一点，正是千百年来令千千万万读者感动的所在。但在今天看来，如此一味地忠孝节义，实在包涵了太多的“愚忠”的内容，令人叹惜！', '文学', '钱彩', '["文学","精选","科幻","推理"]', 80, 110003, 4);
INSERT INTO book(id, name, cover, long_intro, classify, author, tags, chapters_count, word_count, order_by) VALUES ('17c3eba1-abfa-4ac0-98d6-6cd2b973a433', '孽海花', '', '《孽海花》，晚清四大谴责小说之一。清朝曾朴著，初版署名为“爱自由者发起，东亚病夫编述”。作者以状元郎金雯青（影射洪钧）与名妓傅彩云（影射赵彩云）的婚姻生活故事为情节主线，将30年间重要历史事件的侧影及其相关的趣闻轶事，加以剪裁提炼，熔铸成篇。《孽海花》所表现的30年历史内容，亦即同治中期至光绪后期这一特定历史阶段政治和文化的变迁史。《负暄絮语》说：“近来新撰小说，风起云涌，无虑千百种，固自不乏佳构。而才情纵逸，寓意深远者，以《孽海花》为巨擘。”鲁迅《中国小说史略》称其“结构工巧，文采斐然”。', '文学', '曾朴', '["文学","精选","科幻","推理"]', 35, 50043, 5);
INSERT INTO book(id, name, cover, long_intro, classify, author, tags, chapters_count, word_count, order_by) VALUES ('17c3eba1-abfa-4ac0-98d6-6cd2b973a533', '曾国藩家书', '', '本书收录曾氏从年轻至去世前的百余篇较有代表性的家书，按内容大抵可分为修身、治学、齐家、理财、交友、为政、用人等章。由这些书信，可窥斑见豹地探索曾氏一生之行为思想，从中感受到清朝末年的政治风云变幻和他仕途春风得意背后的感觉，由于树大招风，功高盖主，封建王朝随时都有再上演狡兔死，走狗烹的时代悲剧，所以他虽身居高位，但内心却如履薄冰，如临深渊。 曾氏家书是一面镜子，真实折射出了他复杂的内心世界。读之，我们感觉是在和一颗伟大而丰富的心灵在对话，不知不觉中，我们心中涌起了敬意，人生境界得到了净化和超拔。', '文学', '曾国藩', '["文学","精选","科幻","推理"]', 196, 89220, 6);
INSERT INTO book(id, name, cover, long_intro, classify, author, tags, chapters_count, word_count, order_by) VALUES ('17c3eba1-abfa-4ac0-98d6-6cd2b973a633', '浮生六记', '', '《浮生六记》以作者夫妇生活为主线，赢余了平凡而又充满情趣的居家生活的浪游各地的所见所闻。作品描述了作者和妻子陈芸情投意合，想要过一种布衣蔬食而从事艺术的生活，由于封建礼教的压迫与贫困生活的煎熬，终至理想破灭。本书文字清新真率，无雕琢藻饰痕迹，情节则伉俪情深，至死不复；始于欢乐，终于忧患，漂零他乡，悲切动人。此外，本书还收录了清代名士冒襄悼念秦淮名妓董小宛的佳作《影梅庵忆语》。', '文学', '沈三白', '["文学","精选","科幻","推理"]', 4, 10000, 7);
