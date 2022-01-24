CREATE TABLE device (
  id_device            SERIAL NOT NULL, 
  device_typeid        int4 NOT NULL, 
  location             varchar(256), 
  device_typeid_device int4, 
  homeid               int4 NOT NULL, 
  device_statestate_id int4 NOT NULL, 
  PRIMARY KEY (id_device));
CREATE TABLE device_type (
  device_type_id SERIAL NOT NULL, 
  type           varchar(128), 
  PRIMARY KEY (device_type_id));
CREATE TABLE home (
  id      SERIAL NOT NULL, 
  address varchar(256) UNIQUE, 
  tenants varchar(256), 
  PRIMARY KEY (id));
CREATE TABLE command_list (
  command_names        varchar(128) NOT NULL UNIQUE, 
  device_typeid        int4 NOT NULL, 
  type                 varchar(64), 
  time                 timestamp, 
  device_typeid_device int4, 
  PRIMARY KEY (command_names));
CREATE TABLE log_sharing (
  id                    int4 NOT NULL UNIQUE, 
  shared_id             int4 NOT NULL UNIQUE, 
  user_accountsid       int4 NOT NULL, 
  user_accountsusername varchar(128) NOT NULL, 
  profileid             int4 NOT NULL, 
  account_listdomain    int4 NOT NULL, 
  logprofileid          int4, 
  PRIMARY KEY (id, 
  shared_id));
CREATE TABLE action (
  transaction_id            SERIAL NOT NULL, 
  channel                   varchar(128), 
  isPossible                int4, 
  logprofileid              int4, 
  command_listcommand_names varchar(128) NOT NULL, 
  alertalert_id             int4 NOT NULL, 
  PRIMARY KEY (transaction_id));
CREATE TABLE log (
  profileid                SERIAL NOT NULL, 
  sensorOutput             varchar(64), 
  time                     timestamp, 
  transactionId            int4, 
  accountid_account        int4, 
  data_analyzeranalysis_id int4 NOT NULL, 
  alertalert_id            int4 NOT NULL, 
  PRIMARY KEY (profileid));
CREATE TABLE command (
  command_listcommand_names varchar(128) NOT NULL, 
  schedulerschedule_id      int4 NOT NULL, 
  PRIMARY KEY (command_listcommand_names));
CREATE TABLE scheduler (
  schedule_id          SERIAL NOT NULL, 
  "from"               timestamp, 
  "to"                 timestamp, 
  actiontransaction_id int4 NOT NULL, 
  PRIMARY KEY (schedule_id));
CREATE TABLE device_state (
  isWorking        BOOLEAN, 
  working_duration timestamp, 
  state_id         SERIAL NOT NULL, 
  deviceid_device  int4 NOT NULL, 
  PRIMARY KEY (state_id));
CREATE TABLE data_analyzer (
  analysis_id     SERIAL NOT NULL, 
  analysis_result varchar(255), 
  logprofileid    int4 NOT NULL, 
  PRIMARY KEY (analysis_id));
CREATE TABLE security (
  system_hash                              SERIAL NOT NULL, 
  enrolled_voice_listenrolled_voice_domain int4 NOT NULL, 
  recognized_voicevoice_amplitude          int4 NOT NULL, 
  recognized_voicefrequency_domain         int4 NOT NULL, 
  recognized_voicetime_domain              int4 NOT NULL, 
  pattern_extractionmfcc_vector            int4 NOT NULL, 
  pattern_extractiondelta_mfcc_vector      int4 NOT NULL, 
  PRIMARY KEY (system_hash));
CREATE TABLE enrolled_voice_list (
  enrolled_voice_domain                  SERIAL NOT NULL, 
  voice_analyzercomparision_results_list int4 NOT NULL, 
  list_size                              int4, 
  voice_recordtime_domain                int4 NOT NULL, 
  voice_recordfrequency_domain           int4 NOT NULL, 
  voice_recordvoice_amplitude            int4 NOT NULL, 
  pattern_extractionmfcc_vector          int4 NOT NULL, 
  pattern_extractiondelta_mfcc_vector    int4 NOT NULL, 
  PRIMARY KEY (enrolled_voice_domain));
CREATE TABLE recognized_voice (
  time_domain      int4 NOT NULL UNIQUE, 
  frequency_domain int4 NOT NULL UNIQUE, 
  voice_amplitude  int4 NOT NULL UNIQUE, 
  time             int4, 
  PRIMARY KEY (time_domain, 
  frequency_domain, 
  voice_amplitude));
CREATE TABLE decision_result (
  decision_result_id  SERIAL NOT NULL, 
  serverserver_id     int4 NOT NULL, 
  serverserver_domain int4 NOT NULL, 
  status              BOOLEAN, 
  decisiondecision_id int4 NOT NULL, 
  PRIMARY KEY (decision_result_id));
CREATE TABLE add_account (
  operation_id SERIAL NOT NULL, 
  name         varchar(64), 
  surname      varchar(64), 
  username     varchar(128), 
  email        varchar(128), 
  age          int4, 
  password     int4, 
  PRIMARY KEY (operation_id));
CREATE TABLE voice_analyzer (
  comparision_results_list            SERIAL NOT NULL, 
  pattern_extractionmfcc_vector       int4 NOT NULL, 
  pattern_extractiondelta_mfcc_vector int4 NOT NULL, 
  recognized_voicetime_domain         int4 NOT NULL, 
  recognized_voicefrequency_domain    int4 NOT NULL, 
  recognized_voicevoice_amplitude     int4 NOT NULL, 
  PRIMARY KEY (comparision_results_list));
CREATE TABLE decision (
  decision_id                            SERIAL NOT NULL, 
  result                                 int4, 
  voice_analyzercomparision_results_list int4 NOT NULL, 
  PRIMARY KEY (decision_id));
CREATE TABLE pattern_extraction (
  mfcc_vector                      int4 NOT NULL, 
  delta_mfcc_vector                int4 NOT NULL, 
  recognized_voicetime_domain      int4 NOT NULL, 
  recognized_voicefrequency_domain int4 NOT NULL, 
  recognized_voicevoice_amplitude  int4 NOT NULL, 
  PRIMARY KEY (mfcc_vector, 
  delta_mfcc_vector));
CREATE TABLE voice_record (
  time_domain      int4 NOT NULL UNIQUE, 
  frequency_domain int4 NOT NULL UNIQUE, 
  voice_amplitude  int4 NOT NULL UNIQUE, 
  time             int4, 
  PRIMARY KEY (time_domain, 
  frequency_domain, 
  voice_amplitude));
CREATE TABLE alert (
  alert_id             SERIAL NOT NULL, 
  alert_time           timestamp, 
  description          varchar(45), 
  actiontransaction_id int4 NOT NULL, 
  PRIMARY KEY (alert_id));
CREATE TABLE server (
  server_id               int4 NOT NULL UNIQUE, 
  server_domain           int4 NOT NULL UNIQUE, 
  server_time             timestamp, 
  accountid_account       int4 NOT NULL, 
  securitysystem_hash     int4 NOT NULL, 
  add_accountoperation_id int4 NOT NULL, 
  PRIMARY KEY (server_id, 
  server_domain));
CREATE TABLE account_setting (
  account_setting_domain int4 NOT NULL, 
  profileid              int4 NOT NULL, 
  commandList            varchar(256), 
  accountid_account      int4 NOT NULL, 
  PRIMARY KEY (account_setting_domain));
CREATE TABLE device_list (
  device_list_domain                    int4 NOT NULL, 
  list_size                             int4, 
  deviceid_device                       int4, 
  accountid_account                     int4, 
  account_settingaccount_setting_domain int4 NOT NULL, 
  PRIMARY KEY (device_list_domain));
CREATE TABLE account (
  id_account                   SERIAL NOT NULL, 
  username                     varchar(128) UNIQUE, 
  mail_address                 varchar(128) UNIQUE, 
  password                     varchar(128) UNIQUE, 
  account_listdomain           int4 NOT NULL, 
  voice_recordtime_domain      int4 NOT NULL, 
  voice_recordfrequency_domain int4 NOT NULL, 
  voice_recordvoice_amplitude  int4 NOT NULL, 
  PRIMARY KEY (id_account));
CREATE TABLE account_list (
  domain                  varchar(64) NOT NULL, 
  list_size               int4, 
  serverserver_id         int4 NOT NULL, 
  serverserver_domain     int4 NOT NULL, 
  add_accountoperation_id int4 NOT NULL, 
  PRIMARY KEY (domain));
  