CREATE TABLE IF NOT EXISTS cliente (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255)
);

INSERT INTO cliente(nome) VALUES ('Arthur'), ('Lucas'), ('João');