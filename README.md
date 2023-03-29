# Open Excel and Save to Database
## Versions
- jdk 17
- Gradle 7.6
- PostgreSQL 42.2.19
- Lombok 1.18.24
- Poi-ooxml 4.1.2

### 사용한 엑셀 파일 주소
[구글 드라이브](https://docs.google.com/spreadsheets/d/156UQms38rIhkRKW7DtJ3cyga5da1zlfZ/edit?usp=share_link&ouid=103722800894337209511&rtpof=true&sd=true)
### 엑셀 파일 업그레이드 ipynb
[Google Colab](https://colab.research.google.com/drive/1DryM_FAE8fg1SGYGL9ECMqE-NldkMKBr?usp=sharing)

* [poi 참고 블로그](https://velog.io/@uuuouuo/parsing-1)
```groovy
implementation 'org.apache.poi:poi-ooxml:4.1.2'
```
- Postgresql 테이블 DDL
```postgresql
CREATE TABLE drw (
	drw_no int4 NOT NULL,
	bnus_no int4 NOT NULL,
	drw_no_date date NOT NULL,
	drwt_no1 int4 NOT NULL,
	drwt_no2 int4 NOT NULL,
	drwt_no3 int4 NOT NULL,
	drwt_no4 int4 NOT NULL,
	drwt_no5 int4 NOT NULL,
	drwt_no6 int4 NOT NULL,
	first_accumamnt int8 NULL,
	first_przwner_co int4 NULL,
	first_winamnt int8 NULL,
	tot_sellamnt int8 NULL,
	CONSTRAINT drw_pkey PRIMARY KEY (drw_no)
);
```
*Excel -> Map<String, String> -> List<Drw>*





