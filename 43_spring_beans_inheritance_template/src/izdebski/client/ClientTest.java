package izdebski.client;

import izdebski.model.Employee;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class
ClientTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        AbstractApplicationContext ctx= new ClassPathXmlApplicationContext("Beans.xml");

        Employee employee = ctx.getBean("employee", Employee.class);

        System.out.println(employee.getId()+"\t"+employee.getName()+"\t"+employee.getGender()+"\t"+employee.getPanNo());

        ctx.close();

    }
}