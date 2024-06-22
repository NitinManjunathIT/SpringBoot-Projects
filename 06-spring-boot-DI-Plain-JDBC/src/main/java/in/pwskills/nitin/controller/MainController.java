package in.pwskills.nitin.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.pwskills.nitin.beans.EmployeeDTO;
import in.pwskills.nitin.beans.EmployeeVO;
import in.pwskills.nitin.service.IEmployeeMgmtService;

@Component("controller")
public class MainController {

	@Autowired
	private IEmployeeMgmtService service;

	public List<EmployeeVO> showEmpByDesg(String[] desg) throws Exception {
		
		// user service object
		List<EmployeeDTO> listDto = service.fetchEmpByDesg(desg);

		// Create a empty List<EmployeeVO> to hold the objects
		ArrayList<EmployeeVO> listVo = new ArrayList<>();

		listDto.forEach(dto -> {

			EmployeeVO vo = new EmployeeVO();

			// copy such properties whose datatypes and fieldnames should be  same
			BeanUtils.copyProperties(dto, vo);

			// setting the properties whose datatypes are not same
			vo.setDeptNo(String.valueOf(dto.getDeptNo()));
			vo.setMgrNo(String.valueOf(dto.getMgrNo()));
			vo.setEmpNo(String.valueOf(dto.getEmpNo()));
			vo.setSalary(String.valueOf(dto.getSalary()));
			vo.setSrNo(String.valueOf(dto.getSrNo()));

			// keep in list object
			listVo.add(vo);

		});

		return listVo;
	}
}
