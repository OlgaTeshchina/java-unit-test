@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);
        boolean expectid = true;
        assertEquals("При значении >18 метод возвращает false", expectid, isAdult);
        }