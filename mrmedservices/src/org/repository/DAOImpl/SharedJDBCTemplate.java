package org.repository.DAOImpl;

import java.util.List;

import javax.sql.DataSource;

import org.repository.BObjects.CatBO;
import org.repository.BObjects.CompanyBO;
import org.repository.BObjects.PaymentModeBO;
import org.repository.BObjects.TaxationBO;
import org.repository.BObjects.UnitBO;
import org.repository.DAOInterface.SharedDAOInterface;
import org.repository.Mapper.CatBOMapper;
import org.repository.Mapper.CompanyBOMapper;
import org.repository.Mapper.PaymentModeBOMapper;
import org.repository.Mapper.TaxationBOMapper;
import org.repository.Mapper.UnitBOMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class SharedJDBCTemplate implements SharedDAOInterface {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public JdbcTemplate getJdbcTemplateObject() {
		return jdbcTemplateObject;
	}

	public void setJdbcTemplateObject(JdbcTemplate jdbcTemplateObject) {
		this.jdbcTemplateObject = jdbcTemplateObject;
	}

	@Override
	public List<TaxationBO> getTaxation(String dbName) {
		String SQL="select * from "+dbName+".taxation where active='y'";
		List<TaxationBO> t=jdbcTemplateObject.query(SQL, new TaxationBOMapper());
		return t;
	}

	@Override
	public List<UnitBO> getUnit(String dbName) {
		String SQL="select * from "+dbName+".unit where active='y'";
		List<UnitBO> u=jdbcTemplateObject.query(SQL, new UnitBOMapper());
		return u;
	}
	
	@Override
	public List<CatBO> getCat(String dbName) {
		String SQL="select * from "+dbName+".category where active='y'";
		List<CatBO> cat=jdbcTemplateObject.query(SQL, new CatBOMapper());
		return cat;
	}

	@Override
	public List<PaymentModeBO> getPaymentMode(String dbName) {
		String SQL="select * from "+dbName+".paymentmode where active='y'";
		List<PaymentModeBO> p=jdbcTemplateObject.query(SQL, new PaymentModeBOMapper());
		return p;
	}
	
	@Override
	public List<CompanyBO> getCompany(String dbName) {
		String SQL="select * from `mrmed_master`.`company`";
		List<CompanyBO> c=jdbcTemplateObject.query(SQL, new CompanyBOMapper());
		return c;
	}

}
