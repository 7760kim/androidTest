package test;

public class TestVO {

	String manageId;
	String auth;

	public String getManageId() {
		return manageId;
	}
	public void setManageId(String manageId) {
		this.manageId = manageId;
	}
	public String getAuth() {
		return auth;
	}
	public void setAuth(String auth) {
		this.auth = auth;
	}

	@Override
	public String toString() {
		return "TestVO [manageId=" + manageId + ", auth=" + auth + "]";
	}
}
