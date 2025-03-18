package edu.empdemo.example.ParksRecDem.repositories;

//@Repository
public class ParksDepartmentsRepository {//implements ParksDepartmentsJdbcRepository {

    /*
    following worked
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Optional<ParksDepartments> findById(Integer id) {
        try {
            ParksDepartments pd = jdbcTemplate.queryForObject("select * from parks_and_recreation.parks_departments where department_id = ?",
                                                                BeanPropertyRowMapper.newInstance(ParksDepartments.class), id);
            return pd;
        } catch (IncorrectResultSizeDataAccessException e) {
            return null;
        }
    }

    public List<ParksDepartments> findAll() {
        return jdbcTemplate.query("Select * from parks_and_recreation.parks_departments", BeanPropertyRowMapper.newInstance(ParksDepartments.class));
    }

    public Object save(ParksDepartments parksDepartment) {
        return jdbcTemplate.update("insert into parks_and_recreation.parks_departments (department_id, department_name) values (?, ?)",
                new Object[] {parksDepartment.getDeptId(), parksDepartment.getDeptName()});

    }

     */
}
