
CREATE TABLE IF NOT EXISTS parent (
  parent_id INT NOT NULL,
  email VARCHAR(45),
  fname VARCHAR(45),
  lname VARCHAR(45),
  dob DATE,
  phone VARCHAR(45),
  mobile VARCHAR(45),
  status BOOLEAN,
  last_login_date DATE,
  last_login_ip VARCHAR(45),
  PRIMARY KEY (parent_id))
;

CREATE SEQUENCE public.parent_parent_id_seq NO MINVALUE NO MAXVALUE NO CYCLE;
ALTER TABLE public.parent ALTER COLUMN parent_id SET DEFAULT nextval('public.parent_parent_id_seq');
ALTER SEQUENCE public.parent_parent_id_seq OWNED BY public.parent.parent_id;

-- -----------------------------------------------------
-- Table `mydb`.`student`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS  student (
  student_id INT NOT NULL,
  email VARCHAR(45),
  password VARCHAR(45),
  lname VARCHAR(45),
  dob DATE,
  phone VARCHAR(45),
  mobile VARCHAR(45),
  studentcol INT,
  date_of_join DATE,
  status BOOLEAN,
  last_login_date DATE,
  last_login_ip VARCHAR(45),
  parent_id INT,
  PRIMARY KEY (student_id)
  ,
  CONSTRAINT fk_student_parent
  FOREIGN KEY (parent_id)
  REFERENCES parent (parent_id)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION)
;

CREATE SEQUENCE public.student_student_id_seq NO MINVALUE NO MAXVALUE NO CYCLE;
ALTER TABLE public.student ALTER COLUMN student_id SET DEFAULT nextval('public.student_student_id_seq');
ALTER SEQUENCE public.student_student_id_seq OWNED BY public.student.student_id;

CREATE INDEX fk_student_parent_idx ON student (parent_id ASC);

-- -----------------------------------------------------
-- Table `mydb`.`teacher`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS teacher (
  teacher_id INT NOT NULL,
  email VARCHAR(45),
  password VARCHAR(45),
  fname VARCHAR(45),
  lname VARCHAR(45),
  dob DATE,
  phone VARCHAR(45),
  mobile VARCHAR(45),
  status BOOLEAN,
  last_login_date DATE,
  last_login_ip VARCHAR(45),
  PRIMARY KEY (teacher_id))
;

CREATE SEQUENCE public.teacher_teacher_id_seq NO MINVALUE NO MAXVALUE NO CYCLE;
ALTER TABLE public.teacher ALTER COLUMN teacher_id SET DEFAULT nextval('public.teacher_teacher_id_seq');
ALTER SEQUENCE public.teacher_teacher_id_seq OWNED BY public.teacher.teacher_id;

-- -----------------------------------------------------
-- Table `mydb`.`grade`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS grade (
  grade_id INT NOT NULL,
  name VARCHAR(45),
  descrip VARCHAR(45),
  PRIMARY KEY (grade_id))
;

CREATE SEQUENCE public.grade_grade_id_seq NO MINVALUE NO MAXVALUE NO CYCLE;
ALTER TABLE public.grade ALTER COLUMN grade_id SET DEFAULT nextval('public.grade_grade_id_seq');
ALTER SEQUENCE public.grade_grade_id_seq OWNED BY public.grade.grade_id;

-- -----------------------------------------------------
-- Table `mydb`.`course`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS course (
  course_id INT NOT NULL,
  name VARCHAR(45),
  description VARCHAR(45),
  grade_id INT,
  PRIMARY KEY (course_id)
  ,
  CONSTRAINT fk_course_grade1
  FOREIGN KEY (grade_id)
  REFERENCES grade (grade_id)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION)
;

CREATE SEQUENCE public.course_course_id_seq NO MINVALUE NO MAXVALUE NO CYCLE;
ALTER TABLE public.course ALTER COLUMN course_id SET DEFAULT nextval('public.course_course_id_seq');
ALTER SEQUENCE public.course_course_id_seq OWNED BY public.course.course_id;

CREATE INDEX fk_course_grade1_idx ON course (grade_id ASC);


-- -----------------------------------------------------
-- Table `mydb`.`exam_type`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS exam_type (
  exam_type_id INT NOT NULL,
  name VARCHAR(45),
  descrip VARCHAR(45),
  PRIMARY KEY (exam_type_id))
;

CREATE SEQUENCE public.exam_type_exam_type_id_seq NO MINVALUE NO MAXVALUE NO CYCLE;
ALTER TABLE public.exam_type ALTER COLUMN exam_type_id SET DEFAULT nextval('public.exam_type_exam_type_id_seq');
ALTER SEQUENCE public.exam_type_exam_type_id_seq OWNED BY public.exam_type.exam_type_id;

-- -----------------------------------------------------
-- Table `mydb`.`exam`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS exam (
  exam_id INT NOT NULL,
  name VARCHAR(45),
  start_date DATE,
  exam_type_id INT,
  PRIMARY KEY (exam_id)
  ,
  CONSTRAINT fk_exam_exam_type1
  FOREIGN KEY (exam_type_id)
  REFERENCES exam_type (exam_type_id)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION)
;

CREATE SEQUENCE public.exam_exam_id_seq NO MINVALUE NO MAXVALUE NO CYCLE;
ALTER TABLE public.exam ALTER COLUMN exam_id SET DEFAULT nextval('public.exam_exam_id_seq');
ALTER SEQUENCE public.exam_exam_id_seq OWNED BY public.exam.exam_id;

CREATE INDEX fk_exam_exam_type1_idx ON exam (exam_type_id ASC);


-- -----------------------------------------------------
-- Table `mydb`.`exam_result`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS exam_result (
  marks VARCHAR(45) NOT NULL,
  student_id INT,
  course_id INT,
  exam_id INT
  ,
  CONSTRAINT fk_exam_result_student1
  FOREIGN KEY (student_id)
  REFERENCES student (student_id)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION,
  CONSTRAINT fk_exam_result_course1
  FOREIGN KEY (course_id)
  REFERENCES course (course_id)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION,
  CONSTRAINT fk_exam_result_exam1
  FOREIGN KEY (exam_id)
  REFERENCES exam (exam_id)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION)
;

CREATE SEQUENCE public.exam_result_exam_result_id_seq NO MINVALUE NO MAXVALUE NO CYCLE;
ALTER TABLE public.exam_result ALTER COLUMN exam_result_id SET DEFAULT nextval('public.exam_result_exam_result_id_seq');
ALTER SEQUENCE public.exam_result_exam_result_id_seq OWNED BY public.exam_result.exam_result_id;

CREATE INDEX fk_exam_result_student1_idx ON exam_result (student_id ASC);
CREATE INDEX fk_exam_result_course1_idx ON exam_result (course_id ASC);
CREATE INDEX fk_exam_result_exam1_idx ON exam_result (exam_id ASC);


-- -----------------------------------------------------
-- Table `mydb`.`classroom`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS classroom (
  classroom_id INT NOT NULL,
  year VARCHAR(45),
  section CHAR(2),
  status BOOLEAN,
  remarks VARCHAR(45),
  grade_id INT,
  teacher_id INT,
  PRIMARY KEY (classroom_id)
  ,
  CONSTRAINT fk_classroom_grade1
  FOREIGN KEY (grade_id)
  REFERENCES grade (grade_id)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION,
  CONSTRAINT fk_classroom_teacher1
  FOREIGN KEY (teacher_id)
  REFERENCES teacher (teacher_id)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION)
;

CREATE SEQUENCE public.classroom_classroom_id_seq NO MINVALUE NO MAXVALUE NO CYCLE;
ALTER TABLE public.classroom ALTER COLUMN classroom_id SET DEFAULT nextval('public.classroom_classroom_id_seq');
ALTER SEQUENCE public.classroom_classroom_id_seq OWNED BY public.classroom.classroom_id;

CREATE INDEX fk_classroom_grade1_idx ON classroom (grade_id ASC);
CREATE INDEX fk_classroom_teacher1_idx ON classroom (teacher_id ASC);


-- -----------------------------------------------------
-- Table `mydb`.`classroom_student`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS classroom_student (
  classroom_id INT,
  student_id INT
  ,
  CONSTRAINT fk_classroom_student_classroom1
  FOREIGN KEY (classroom_id)
  REFERENCES classroom (classroom_id)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION,
  CONSTRAINT fk_classroom_student_student1
  FOREIGN KEY (student_id)
  REFERENCES student (student_id)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION)
;

CREATE SEQUENCE public.classroom_student_classroom_student_id_seq NO MINVALUE NO MAXVALUE NO CYCLE;
ALTER TABLE public.classroom_student ALTER COLUMN classroom_student_id SET DEFAULT nextval('public.classroom_student_classroom_student_id_seq');
ALTER SEQUENCE public.classroom_student_classroom_student_id_seq OWNED BY public.classroom_student.classroom_student_id;

CREATE INDEX fk_classroom_student_classroom1_idx ON classroom_student (classroom_id ASC);
CREATE INDEX fk_classroom_student_student1_idx ON classroom_student (student_id ASC);


-- -----------------------------------------------------
-- Table `mydb`.`attendance`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS attendance (
  date DATE,
  status BOOLEAN,
  remark TEXT,
  student_id INT,
  PRIMARY KEY (date)
  ,
  CONSTRAINT fk_attendance_student1
  FOREIGN KEY (student_id)
  REFERENCES student (student_id)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION)
;

CREATE SEQUENCE public.attendance_attendance_id_seq NO MINVALUE NO MAXVALUE NO CYCLE;
ALTER TABLE public.attendance ALTER COLUMN attendance_id SET DEFAULT nextval('public.attendance_attendance_id_seq');
ALTER SEQUENCE public.attendance_attendance_id_seq OWNED BY public.attendance.attendance_id;

CREATE INDEX fk_attendance_student1_idx ON attendance (student_id ASC);

ALTER TABLE public.attendance ADD attendance_id INT NOT NULL;
ALTER TABLE public.attendance DROP CONSTRAINT attendance_pkey;
ALTER TABLE public.attendance ADD CONSTRAINT attendance_attendance_id_pk PRIMARY KEY (attendance_id);

ALTER TABLE public.classroom_student ADD classroom_student_id INT NOT NULL;
ALTER TABLE public.classroom_student ADD CONSTRAINT classroom_student_classroom_student_id_pk PRIMARY KEY (classroom_student_id);

ALTER TABLE public.exam_result ADD exam_result_id INT NOT NULL;
ALTER TABLE public.exam_result ADD CONSTRAINT exam_result_exam_result_id_pk PRIMARY KEY (exam_result_id);

ALTER TABLE public.student ADD fname VARCHAR(45) NULL;


/* SET SQL_MODE=@OLD_SQL_MODE; */
/* SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS; */
/* SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS; */