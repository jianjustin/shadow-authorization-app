INSERT INTO sys_resource(resource_id,resource_name,resource_url,resource_operation,resource_type,order_by) VALUES ('5d75263f-1f30-46a1-b3e6-b1f380af70ae', '添加资源', '/sys/resource/save', 'sys.resource.save', 1, 1);
INSERT INTO sys_resource(resource_id,resource_name,resource_url,resource_operation,resource_type,order_by) VALUES ('2d5d28e4-8f14-4ccb-87f3-307f6acd8566', '修改资源', '/sys/resource/update', 'sys.resource.update', 1, 8);
INSERT INTO sys_resource(resource_id,resource_name,resource_url,resource_operation,resource_type,order_by) VALUES ('d94c4fbf-5745-482c-813d-e4babcc4bd07', '删除资源', '/sys/resource/delete', 'sys.resource.delete', 1, 2);
INSERT INTO sys_resource(resource_id,resource_name,resource_url,resource_operation,resource_type,order_by) VALUES ('db71c382-dfbf-41e0-a2f1-73d697b1e94f', '查看资源', '/sys/resource/query', 'sys.resource.query', 1, 3);
INSERT INTO sys_resource(resource_id,resource_name,resource_url,resource_operation,resource_type,order_by) VALUES ('e97ef268-f261-49bc-bdb8-a3a0eb417d41', '添加权限', '/sys/permission/save', 'sys.permission.save', 1, 4);
INSERT INTO sys_resource(resource_id,resource_name,resource_url,resource_operation,resource_type,order_by) VALUES ('445c2ae6-0bf5-4c46-8aa5-fd4ebbe4d83c', '修改权限', '/sys/permission/update', 'sys.permission.update', 1, 8);
INSERT INTO sys_resource(resource_id,resource_name,resource_url,resource_operation,resource_type,order_by) VALUES ('5ac6123d-472b-4812-a40f-573fb6acc2c4', '删除权限', '/sys/permission/delete', 'sys.permission.delete', 1, 5);
INSERT INTO sys_resource(resource_id,resource_name,resource_url,resource_operation,resource_type,order_by) VALUES ('2eb88c79-bf5d-49b2-a56a-614cc7c48415', '查看权限', '/sys/permission/query', 'sys.permission.query', 1, 6);
INSERT INTO sys_resource(resource_id,resource_name,resource_url,resource_operation,resource_type,order_by) VALUES ('924ac8ba-5705-4ca3-bfc6-5a9dc9eb9f40', '添加角色', '/sys/role/save', 'sys.role.save', 1, 7);
INSERT INTO sys_resource(resource_id,resource_name,resource_url,resource_operation,resource_type,order_by) VALUES ('bf3f0b6a-488a-479d-b4e8-23f3779167b2', '修改角色', '/sys/role/update', 'sys.role.update', 1, 8);
INSERT INTO sys_resource(resource_id,resource_name,resource_url,resource_operation,resource_type,order_by) VALUES ('2eb61322-1c87-428a-b0bc-ee0f54ed3940', '删除角色', '/sys/role/delete', 'sys.role.delete', 1, 9);
INSERT INTO sys_resource(resource_id,resource_name,resource_url,resource_operation,resource_type,order_by) VALUES ('d9fc0cad-923c-461d-ad46-4422400d581a', '查询角色', '/sys/role/query', 'sys.role.query', 1, 10);
INSERT INTO sys_resource(resource_id,resource_name,resource_url,resource_operation,resource_type,order_by) VALUES ('e296706c-4219-481a-af45-cf9d194204be', '添加用户', '/sys/user/save', 'sys.user.save', 1, 11);
INSERT INTO sys_resource(resource_id,resource_name,resource_url,resource_operation,resource_type,order_by) VALUES ('1384aff7-c83c-4f4d-8932-9b4f96631df6', '修改用户', '/sys/user/update', 'sys.user.update', 1, 12);
INSERT INTO sys_resource(resource_id,resource_name,resource_url,resource_operation,resource_type,order_by) VALUES ('8cddc539-3edb-4ecb-85ca-42adff03437f', '删除用户', '/sys/user/delete', 'sys.user.delete', 1, 13);
INSERT INTO sys_resource(resource_id,resource_name,resource_url,resource_operation,resource_type,order_by) VALUES ('bd02f37d-5729-4aac-8007-a6f2f28ba7c4', '查询用户', '/sys/user/query', 'sys.user.query', 1, 14);
INSERT INTO sys_resource(resource_id,resource_name,resource_url,resource_operation,resource_type,order_by) VALUES ('4a17a373-2492-4c14-8493-f68601ead4b3', '查询分类', '/classify/query', 'classify.query', 1, 15);
INSERT INTO sys_resource(resource_id,resource_name,resource_url,resource_operation,resource_type,order_by) VALUES ('f7012a17-bdda-469b-91be-47b26c9edcfb', '查询书籍', '/book/query', 'book.query', 1, 16);


INSERT INTO sys_role(role_id,role_name,role_type,order_by) VALUES ('e09a1dad-7ceb-4900-bbf8-9814c5e47b93', 'ADMIN', 0, 1);
INSERT INTO sys_role(role_id,role_name,role_type,order_by) VALUES ('87a9609c-2b0b-43ec-9bf3-bfb8937e62e3', 'USER', 1, 2);

INSERT INTO sys_user(user_id,username,password,department_id,post_id,order_by) VALUES ('eb0d0222-15c2-41e8-95c7-58bf68d948f7', 'admin', '$2a$10$uasT4Zvy0BrcSKxPGVOdeuMohuspzDRZXqgd58n.2LpzG6t8DoW62', 0, 0, 0);
INSERT INTO sys_user(user_id,username,password,department_id,post_id,order_by) VALUES ('f5ecc467-3170-4d34-8929-cce586b59e8e', 'user', '$2a$10$fIk0t6E3izAL1ODh5YLCSe5etuTUJsv9a9ew3.lxslpVCOaBkwoI6', 0, 0, 1);

INSERT INTO sys_user_role(user_role_id, user_id,role_id) VALUES ('b0f6ee91-01c5-4e6c-89bb-1ebc92d818a0', 'eb0d0222-15c2-41e8-95c7-58bf68d948f7', 'e09a1dad-7ceb-4900-bbf8-9814c5e47b93');
INSERT INTO sys_user_role(user_role_id, user_id,role_id) VALUES ('aa2db5c4-c1b6-4137-ae44-e44dd259b47e', 'f5ecc467-3170-4d34-8929-cce586b59e8e', '87a9609c-2b0b-43ec-9bf3-bfb8937e62e3');

INSERT INTO sys_permission(permission_id,resource_id,role_id,permission_status,order_by) VALUES ('55fa0a24-c273-4d48-bc8c-da2d40197aa3', '5d75263f-1f30-46a1-b3e6-b1f380af70ae', 'e09a1dad-7ceb-4900-bbf8-9814c5e47b93', 1, 1);
INSERT INTO sys_permission(permission_id,resource_id,role_id,permission_status,order_by) VALUES ('6c3acc75-b1a0-4191-bb5b-cfac939ec000', '2d5d28e4-8f14-4ccb-87f3-307f6acd8566', 'e09a1dad-7ceb-4900-bbf8-9814c5e47b93', 1, 2);
INSERT INTO sys_permission(permission_id,resource_id,role_id,permission_status,order_by) VALUES ('f79a93dc-ad34-4074-98ea-8231ef41e9cc', 'd94c4fbf-5745-482c-813d-e4babcc4bd07', 'e09a1dad-7ceb-4900-bbf8-9814c5e47b93', 1, 3);
INSERT INTO sys_permission(permission_id,resource_id,role_id,permission_status,order_by) VALUES ('7b2f077f-e5f4-4cf5-b9f2-7ab35b1542dc', 'db71c382-dfbf-41e0-a2f1-73d697b1e94f', 'e09a1dad-7ceb-4900-bbf8-9814c5e47b93', 1, 4);
INSERT INTO sys_permission(permission_id,resource_id,role_id,permission_status,order_by) VALUES ('a0d154a9-1ac5-40e0-afcc-a1fee771af17', 'e97ef268-f261-49bc-bdb8-a3a0eb417d41', 'e09a1dad-7ceb-4900-bbf8-9814c5e47b93', 1, 5);
INSERT INTO sys_permission(permission_id,resource_id,role_id,permission_status,order_by) VALUES ('11aeed7a-f1c0-4dc6-aa5a-1df576f7623a', '445c2ae6-0bf5-4c46-8aa5-fd4ebbe4d83c', 'e09a1dad-7ceb-4900-bbf8-9814c5e47b93', 1, 6);
INSERT INTO sys_permission(permission_id,resource_id,role_id,permission_status,order_by) VALUES ('74cf461f-009b-42f9-9675-f15aaf70bcb7', '5ac6123d-472b-4812-a40f-573fb6acc2c4', 'e09a1dad-7ceb-4900-bbf8-9814c5e47b93', 1, 7);
INSERT INTO sys_permission(permission_id,resource_id,role_id,permission_status,order_by) VALUES ('bf46914e-7560-4a6e-b2ff-3c4d5f39aa7b', '2eb88c79-bf5d-49b2-a56a-614cc7c48415', 'e09a1dad-7ceb-4900-bbf8-9814c5e47b93', 1, 8);
INSERT INTO sys_permission(permission_id,resource_id,role_id,permission_status,order_by) VALUES ('8e9c9dac-a439-44bf-becc-2bacba59f68a', '924ac8ba-5705-4ca3-bfc6-5a9dc9eb9f40', 'e09a1dad-7ceb-4900-bbf8-9814c5e47b93', 1, 9);
INSERT INTO sys_permission(permission_id,resource_id,role_id,permission_status,order_by) VALUES ('ce5c416a-a199-43ac-8caf-8798c90420e0', 'bf3f0b6a-488a-479d-b4e8-23f3779167b2', 'e09a1dad-7ceb-4900-bbf8-9814c5e47b93', 1, 10);
INSERT INTO sys_permission(permission_id,resource_id,role_id,permission_status,order_by) VALUES ('c5e7e6bc-a23f-4bf2-88c6-cdf0d42bf3a6', '2eb61322-1c87-428a-b0bc-ee0f54ed3940', 'e09a1dad-7ceb-4900-bbf8-9814c5e47b93', 1, 11);
INSERT INTO sys_permission(permission_id,resource_id,role_id,permission_status,order_by) VALUES ('46c5f34c-9507-4faa-80e4-f60eb39a39cb', 'd9fc0cad-923c-461d-ad46-4422400d581a', 'e09a1dad-7ceb-4900-bbf8-9814c5e47b93', 1, 12);
INSERT INTO sys_permission(permission_id,resource_id,role_id,permission_status,order_by) VALUES ('0776a520-b71f-40b9-838f-3ec9a6ce9117', 'e296706c-4219-481a-af45-cf9d194204be', 'e09a1dad-7ceb-4900-bbf8-9814c5e47b93', 1, 13);
INSERT INTO sys_permission(permission_id,resource_id,role_id,permission_status,order_by) VALUES ('35dd7075-2f7f-4e8e-acd4-181726e42e5e', '1384aff7-c83c-4f4d-8932-9b4f96631df6', 'e09a1dad-7ceb-4900-bbf8-9814c5e47b93', 1, 14);
INSERT INTO sys_permission(permission_id,resource_id,role_id,permission_status,order_by) VALUES ('cb3b64e5-e5ae-4f23-aebb-f364bc960743', '8cddc539-3edb-4ecb-85ca-42adff03437f', 'e09a1dad-7ceb-4900-bbf8-9814c5e47b93', 1, 15);
INSERT INTO sys_permission(permission_id,resource_id,role_id,permission_status,order_by) VALUES ('fb5182d2-8f32-495e-bac3-a253f01d43ae', 'bd02f37d-5729-4aac-8007-a6f2f28ba7c4', 'e09a1dad-7ceb-4900-bbf8-9814c5e47b93', 1, 16);
INSERT INTO sys_permission(permission_id,resource_id,role_id,permission_status,order_by) VALUES ('f59606d0-aeb2-4239-b641-4a477f913758', '4a17a373-2492-4c14-8493-f68601ead4b3', 'e09a1dad-7ceb-4900-bbf8-9814c5e47b93', 1, 17);
INSERT INTO sys_permission(permission_id,resource_id,role_id,permission_status,order_by) VALUES ('54b47c6a-debd-416c-9447-09404350cd15', 'f7012a17-bdda-469b-91be-47b26c9edcfb', 'e09a1dad-7ceb-4900-bbf8-9814c5e47b93', 1, 17);

INSERT INTO sys_permission(permission_id,resource_id,role_id,permission_status,order_by) VALUES ('5be010f0-b5a3-42ed-99a2-adb22054ec3e', '4a17a373-2492-4c14-8493-f68601ead4b3', '87a9609c-2b0b-43ec-9bf3-bfb8937e62e3', 1, 17);
INSERT INTO sys_permission(permission_id,resource_id,role_id,permission_status,order_by) VALUES ('e5189bac-f6d2-4ed5-92d3-65726fa269ce', 'f7012a17-bdda-469b-91be-47b26c9edcfb', '87a9609c-2b0b-43ec-9bf3-bfb8937e62e3', 1, 18);

INSERT INTO classify(id, name, book_count, monthly_count, icon, order_by) VALUES ('364d6855-125c-4e95-b20c-fb2f16fd94b0', '精选', 0, 0, '/icon/精选_.png',1);
INSERT INTO classify(id, name, book_count, monthly_count, icon, order_by) VALUES ('503c4472-93c8-4d2e-8b34-aea0408ebc59', '文学', 0, 0, '/icon/文学_.png',2);
INSERT INTO classify(id, name, book_count, monthly_count, icon, order_by) VALUES ('2f390b67-3268-4f68-80fd-744c9ae9556b', '科幻', 0, 0, '/icon/科幻_.png',3);
INSERT INTO classify(id, name, book_count, monthly_count, icon, order_by) VALUES ('17c3eba1-abfa-4ac0-98d6-6cd2b973a333', '推理', 0, 0, '/icon/推理_.png',4);

INSERT INTO book(id, name, cover, long_intro, classify, author, tags, chapters_count, word_count, order_by) VALUES ('17c3eba1-abfa-4ac0-98d6-6cd2b973a333', '说岳全传', '', '是一部以岳飞抗金故事为题材、带有某种历史演义色彩的英雄传奇小说。本书所写的忠奸斗争是在南宋立国未稳、金兵大举进兵中原的特殊历史背景之下展开的。岳飞等爱国将领，力主抗战，收复失地；而秦桧为首的权奸集团，则竭力主张卖国求和。因此，爱国与卖国、抗战与投降，便成为作品中反映的忠奸斗争的具体内容。全书的主旨秉承自宋以来延续数百年的忠君爱国思想，热情讴歌岳飞及其岳家将的尽忠抗敌，保家卫国的爱国主义精神，痛斥秦桧等权奸投降卖国、残害忠良的无耻行径。集中体现这一思想精华的，就是岳飞这一形象。岳飞勇武过人，智谋卓越，忠孝节义，精忠报国，是个理想化的人物。为了一个“忠” 字，他可以置战场胜败于不顾，置身家性命于度外，慷慨就义，别无怨言。这一点，正是千百年来令千千万万读者感动的所在。但在今天看来，如此一味地忠孝节义，实在包涵了太多的“愚忠”的内容，令人叹惜！', '文学', '钱彩', '["文学","精选","科幻","推理"]', 80, 110003, 4);
INSERT INTO book(id, name, cover, long_intro, classify, author, tags, chapters_count, word_count, order_by) VALUES ('17c3eba1-abfa-4ac0-98d6-6cd2b973a433', '孽海花', '', '《孽海花》，晚清四大谴责小说之一。清朝曾朴著，初版署名为“爱自由者发起，东亚病夫编述”。作者以状元郎金雯青（影射洪钧）与名妓傅彩云（影射赵彩云）的婚姻生活故事为情节主线，将30年间重要历史事件的侧影及其相关的趣闻轶事，加以剪裁提炼，熔铸成篇。《孽海花》所表现的30年历史内容，亦即同治中期至光绪后期这一特定历史阶段政治和文化的变迁史。《负暄絮语》说：“近来新撰小说，风起云涌，无虑千百种，固自不乏佳构。而才情纵逸，寓意深远者，以《孽海花》为巨擘。”鲁迅《中国小说史略》称其“结构工巧，文采斐然”。', '文学', '曾朴', '["文学","精选","科幻","推理"]', 35, 50043, 5);
INSERT INTO book(id, name, cover, long_intro, classify, author, tags, chapters_count, word_count, order_by) VALUES ('17c3eba1-abfa-4ac0-98d6-6cd2b973a533', '曾国藩家书', '', '本书收录曾氏从年轻至去世前的百余篇较有代表性的家书，按内容大抵可分为修身、治学、齐家、理财、交友、为政、用人等章。由这些书信，可窥斑见豹地探索曾氏一生之行为思想，从中感受到清朝末年的政治风云变幻和他仕途春风得意背后的感觉，由于树大招风，功高盖主，封建王朝随时都有再上演狡兔死，走狗烹的时代悲剧，所以他虽身居高位，但内心却如履薄冰，如临深渊。 曾氏家书是一面镜子，真实折射出了他复杂的内心世界。读之，我们感觉是在和一颗伟大而丰富的心灵在对话，不知不觉中，我们心中涌起了敬意，人生境界得到了净化和超拔。', '文学', '曾国藩', '["文学","精选","科幻","推理"]', 196, 89220, 6);
INSERT INTO book(id, name, cover, long_intro, classify, author, tags, chapters_count, word_count, order_by) VALUES ('17c3eba1-abfa-4ac0-98d6-6cd2b973a633', '浮生六记', '', '《浮生六记》以作者夫妇生活为主线，赢余了平凡而又充满情趣的居家生活的浪游各地的所见所闻。作品描述了作者和妻子陈芸情投意合，想要过一种布衣蔬食而从事艺术的生活，由于封建礼教的压迫与贫困生活的煎熬，终至理想破灭。本书文字清新真率，无雕琢藻饰痕迹，情节则伉俪情深，至死不复；始于欢乐，终于忧患，漂零他乡，悲切动人。此外，本书还收录了清代名士冒襄悼念秦淮名妓董小宛的佳作《影梅庵忆语》。', '文学', '沈三白', '["文学","精选","科幻","推理"]', 4, 10000, 7);
