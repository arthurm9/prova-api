CREATE TABLE IF NOT EXISTS contaspagar (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    dataconta DATE,
    datavencimento DATE,
    clienteid INT NOT NULL,
    valor DECIMAL(12, 2)
);

ALTER TABLE contaspagar ADD CONSTRAINT FK_ContasPagar_Cliente FOREIGN KEY (clienteid) REFERENCES cliente(id);

INSERT INTO contaspagar(dataconta, datavencimento, clienteid, valor) VALUES('2023/03/29', '2023/04/05', 1, 2000);