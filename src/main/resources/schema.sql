CREATE TABLE greetings (
       id SERIAL PRIMARY KEY,
       lang_code VARCHAR(10) UNIQUE NOT NULL,  -- 예: en, kr, jp
       message TEXT NOT NULL                   -- 예: Hello, 안녕하세요, こんにちは
);