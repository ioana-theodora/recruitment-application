create table CAN_SOCIAL_STATUS (ID bigint primary key, 
					 SOS_NAME varchar(256) not null);
					 
create table CAN_STATUS (ID bigint primary key, 
					 STS_NAME varchar(256) not null);
					 
create table CAN_SKILL (ID bigint primary key, 
					 SKILL_NAME varchar(256) not null);					 
					 
create table CAN_JOB (ID bigint primary key, 
					 JOB_NAME varchar(256) not null);						 
					 
create table CAN_CV (ID bigint primary key, 
					 CV_LINK varchar(256) not null);					 
					 
create table CAN_DEV (ID bigint primary key, 
					 DEV_RANK varchar(256) not null);

create table CAN_CONTACT (ID bigint primary key, 
					 CONT_PHONE_NUMBER varchar(256) null,
					 CONT_FACEBOOK varchar(256) null,
					 CONT_LINKDIN varchar(256) null,
					 CONT_SKYPE varchar(256) null
					 );	
					 
create table CAN_POSITION (ID bigint primary key, 
					 POS_POSITION varchar(256) not null,
					 POS_DEVELOPER_ID bigint not null,
					 FOREIGN KEY (POS_DEVELOPER_ID) REFERENCES CAN_DEV (ID));
					 
create table CAN_ADDRESS (ID bigint primary key, 
					 ADD_COUNTRY varchar(256) not null,
					 ADD_REGION varchar(256) not null,
					 ADD_CITY varchar(256) not null,
					 ADD_STREET varchar(256) not null,
					 ADD_NUMBER varchar(256) not null);				
					 
create table CAN_CANDIDATE (ID bigint primary key, 
					 CAN_EMAIL varchar(256) not null,
					 CAN_FIRST_NAME varchar(256) not null,
					 CAN_LAST_NAME varchar(256) not null,
					 CAN_DATE_OF_BIRTH TIMESTAMP WITH TIME ZONE,
					 
					 CAN_ADDRESS_ID bigint,
					 CAN_CONTACT_ID bigint,
					 CAN_POSITION_ID bigint,
					 CAN_SKILL_ID bigint not null,
					 CAN_JOB_ID bigint,
					 CAN_STATUS_ID bigint,
					 CAN_CV_ID bigint,
					 
					 FOREIGN KEY (CAN_ADDRESS_ID) REFERENCES CAN_ADDRESS (ID),
					 FOREIGN KEY (CAN_CONTACT_ID) REFERENCES CAN_CONTACT (ID),
					 FOREIGN KEY (CAN_POSITION_ID) REFERENCES CAN_POSITION (ID),
					 FOREIGN KEY (CAN_SKILL_ID) REFERENCES CAN_SKILL (ID),
					 FOREIGN KEY (CAN_JOB_ID) REFERENCES CAN_JOB (ID),
					 FOREIGN KEY (CAN_STATUS_ID) REFERENCES CAN_STATUS (ID),
					 FOREIGN KEY (CAN_CV_ID) REFERENCES CAN_CV (ID)
					 );						 
					 