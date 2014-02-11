CREATE USER 'kuldemoclient'@'localhost' IDENTIFIED BY 'kuldemoclient';
CREATE DATABASE IF NOT EXISTS kuldemoclient DEFAULT CHARACTER SET 'utf8' DEFAULT COLLATE 'utf8_bin';
GRANT ALL ON kuldemoclient.* TO 'kuldemoclient'@'localhost' WITH GRANT OPTION;    
