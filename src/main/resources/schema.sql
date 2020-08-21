-- SEQUENCE: edukar_school.school_id_sequence

-- DROP SEQUENCE edukar_school.school_id_sequence;

CREATE SEQUENCE IF NOT EXISTS edukar_school.school_id_sequence
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

ALTER SEQUENCE edukar_school.school_id_sequence
    OWNER TO reenolesigues;
   
