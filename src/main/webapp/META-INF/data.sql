insert into AROLE(ID,NAME) values (0,'ADMIN');
insert into AROLE(ID,NAME) values (1,'OPER');
insert into AROLE(ID,NAME) values (2,'USER');

insert into ROLE_ACTIONS(ROLE_ID,ROLE_ACTION) values (1,'BROWSE_USERS');
insert into ROLE_ACTIONS(ROLE_ID,ROLE_ACTION) values (1,'EDIT_CONTACT_TYPES');
insert into ROLE_ACTIONS(ROLE_ID,ROLE_ACTION) values (1,'EDIT_ANY_PERSON_DATA');
insert into ROLE_ACTIONS(ROLE_ID,ROLE_ACTION) values (2,'BROWSE_USERS');
insert into ROLE_ACTIONS(ROLE_ID,ROLE_ACTION) values (2,'EDIT_OWN_PERSON_DATA');

insert into PERSON(ID,NAME,PATRONYMIC,SURNAME) values (0,'Денис','Александрович','Иванов');
insert into PERSON(ID,NAME,PATRONYMIC,SURNAME) values (1,'Игорь',null,'Петров');
insert into PERSON(ID,NAME,PATRONYMIC,SURNAME) values (2,'Олег',null,'Сидоров');

insert into AUSER(ID,LOGIN,PASSWORD) values (0,'ADMIN','qwerty123');
insert into AUSER(ID,LOGIN,PASSWORD) values (1,'OPER','qwerty');
insert into AUSER(ID,LOGIN,PASSWORD) values (2,'USER','123');

insert into AUSER_AROLE(AUSER_ID,ROLES_ID) values (0,0);
insert into AUSER_AROLE(AUSER_ID,ROLES_ID) values (1,1);
insert into AUSER_AROLE(AUSER_ID,ROLES_ID) values (2,2);

insert into CONTACTTYPE(ID,TYPENAME) values (0,'Телефон');
insert into CONTACTTYPE(ID,TYPENAME) values (1,'E-Mail');
insert into CONTACTTYPE(ID,TYPENAME) values (2,'Skype');

insert into CONTACT(PERSON_ID,TYPE_ID,CONTACT) values (0,0,'12-85-00');
insert into CONTACT(PERSON_ID,TYPE_ID,CONTACT) values (0,1,'da.ivanov@mail.com');
insert into CONTACT(PERSON_ID,TYPE_ID,CONTACT) values (2,2,'o_sidorov');
