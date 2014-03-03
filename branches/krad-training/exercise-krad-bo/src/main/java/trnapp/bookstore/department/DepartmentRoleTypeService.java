package trnapp.bookstore.department;

import org.kuali.rice.kns.kim.role.RoleTypeServiceBase;

public class DepartmentRoleTypeService extends RoleTypeServiceBase {
	private DepartmentService departmentService;

	public DepartmentService getDepartmentService() {
		return departmentService;
	}

	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
}
