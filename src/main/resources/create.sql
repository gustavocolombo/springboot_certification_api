INSERT INTO questions (id, description, technology) VALUES
('c5f02721-6dc3-4fa6-b46d-6f2e8dca9c66', 'Como criar uma classe em Java?', 'JAVA'),
('75f2ac49-d300-4d30-b4bf-530e07ac6034', 'Explique o conceito de polimorfismo em Java', 'JAVA'),
('f85e9434-1711-4e02-9f9e-7831aa5c743a', 'Como lidar com exceções em Java?', 'JAVA');

INSERT INTO alternatives (id, question_id, is_correct, description) VALUES
('725a6def-a650-4576-8817-56e65611d42f', 'c5f02721-6dc3-4fa6-b46d-6f2e8dca9c66', true, 'Usando a palavra-chave "class"'),
('5ee90168-13db-4c72-9866-01d3ac57c729', 'c5f02721-6dc3-4fa6-b46d-6f2e8dca9c66', false, 'Definindo uma interface em Java'),
('99327d37-62a0-4040-810d-d667e3f7a891', 'c5f02721-6dc3-4fa6-b46d-6f2e8dca9c66', false, 'Utilizando métodos estáticos'),
('41f4cd0f-8422-43dd-94fe-68d73370d72e', 'c5f02721-6dc3-4fa6-b46d-6f2e8dca9c66', false, 'Criando um construtor padrão');

INSERT INTO alternatives (id, question_id, is_correct, description) VALUES
('1dabf5dd-7aB2-4034-8060-4648b55141F2', '75f2ac49-d300-4d30-b4bf-530e07ac6034', false, 'Herança simples'),
('efbe2641-dd66-4d58-b672-9065308b9245', '75f2ac49-d300-4d30-b4bf-530e07ac6034', false, 'Encapsulamento em Java'),
('9804e57d-f128-4ad2-afa4-ba40f32cdee0', '75f2ac49-d300-4d30-b4bf-530e07ac6034', false, 'Sobrecarga de métodos'),
('065c5046-0bb2-43ec-843c-a30ad43d59f8', '75f2ac49-d300-4d30-b4bf-530e07ac6034', true, 'Capacidade de um objeto de assumir várias formas');

INSERT INTO alternatives (id, question_id, is_correct, description) VALUES
('3528a132-9c12-4c8a-aa93-9f6e813c43d1', 'f85e9434-1711-4e02-9f9e-7831aa5c743a', false, 'Ignorando a exceção'),
('d3e51a56-9b97-4bbB-9827-8bcf89f4b276', 'f85e9434-1711-4e02-9f9e-7831aa5c743a', true, 'Utitizando blocos try-catch'),
('28e221e1-3f5d-492f-a4be-d4c2cdc2447b', 'f85e9434-1711-4e02-9f9e-7831aa5c743a', false, 'Declarando uma exceção sem tratamento'),
('e4dbf524-0a54-428a-b57c-853996fcBe19', 'f85e9434-1711-4e02-9f9e-7831aa5c743a', false, 'Usando a palavra-chave "finally"');