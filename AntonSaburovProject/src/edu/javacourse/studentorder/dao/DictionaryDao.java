package edu.javacourse.studentorder.dao;

import edu.javacourse.studentorder.domain.CountryArea;
import edu.javacourse.studentorder.domain.wedding.PassportOffice;
import edu.javacourse.studentorder.domain.wedding.RegisterOffice;
import edu.javacourse.studentorder.domain.wedding.Street;
import edu.javacourse.studentorder.exception.DaoException;

import java.util.List;

public interface DictionaryDao {
    List<Street> findStreets(String pattern) throws DaoException;
    List<PassportOffice> findPassportOffice(String areaId) throws DaoException;
    List<RegisterOffice> findRegisterOffice(String areaId) throws DaoException;
    List<CountryArea> findAreas(String areaId) throws DaoException;



}
