package com.medium.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QUsers is a Querydsl query type for QUsers
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QUsers extends com.querydsl.sql.RelationalPathBase<QUsers> {

    private static final long serialVersionUID = -1225182155;

    public static final QUsers users = new QUsers("users");

    public final NumberPath<Double> baseSalary = createNumber("baseSalary", Double.class);

    public final NumberPath<Double> bonus = createNumber("bonus", Double.class);

    public final StringPath businessTitle = createString("businessTitle");

    public final StringPath companyCode = createString("companyCode");

    public final DatePath<java.sql.Date> continuousServiceDate = createDate("continuousServiceDate", java.sql.Date.class);

    public final StringPath costCenterCode = createString("costCenterCode");

    public final StringPath costCenterName = createString("costCenterName");

    public final StringPath cpmUrl = createString("cpmUrl");

    public final DateTimePath<java.sql.Timestamp> createdAt = createDateTime("createdAt", java.sql.Timestamp.class);

    public final StringPath currency = createString("currency");

    public final DatePath<java.sql.Date> dateOfBirth = createDate("dateOfBirth", java.sql.Date.class);

    public final StringPath email = createString("email");

    public final StringPath employeeId = createString("employeeId");

    public final StringPath employeeType = createString("employeeType");

    public final StringPath grade = createString("grade");

    public final StringPath hrsWeek = createString("hrsWeek");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath isActive = createString("isActive");

    public final BooleanPath isPeopleManager = createBoolean("isPeopleManager");

    public final StringPath jobFamily = createString("jobFamily");

    public final StringPath jobFamilyGroup = createString("jobFamilyGroup");

    public final StringPath jobProfile = createString("jobProfile");

    public final StringPath jobProfileName = createString("jobProfileName");

    public final DatePath<java.sql.Date> latestVmwHireDate = createDate("latestVmwHireDate", java.sql.Date.class);

    public final StringPath legalFirstName = createString("legalFirstName");

    public final StringPath legalFullName = createString("legalFullName");

    public final StringPath legalLastName = createString("legalLastName");

    public final StringPath managementLevel = createString("managementLevel");

    public final StringPath mgmtHierarchyLevel1 = createString("mgmtHierarchyLevel1");

    public final StringPath mgmtHierarchyLevel10 = createString("mgmtHierarchyLevel10");

    public final StringPath mgmtHierarchyLevel11 = createString("mgmtHierarchyLevel11");

    public final StringPath mgmtHierarchyLevel12 = createString("mgmtHierarchyLevel12");

    public final StringPath mgmtHierarchyLevel2 = createString("mgmtHierarchyLevel2");

    public final StringPath mgmtHierarchyLevel3 = createString("mgmtHierarchyLevel3");

    public final StringPath mgmtHierarchyLevel4 = createString("mgmtHierarchyLevel4");

    public final StringPath mgmtHierarchyLevel5 = createString("mgmtHierarchyLevel5");

    public final StringPath mgmtHierarchyLevel6 = createString("mgmtHierarchyLevel6");

    public final StringPath mgmtHierarchyLevel7 = createString("mgmtHierarchyLevel7");

    public final StringPath mgmtHierarchyLevel8 = createString("mgmtHierarchyLevel8");

    public final StringPath mgmtHierarchyLevel9 = createString("mgmtHierarchyLevel9");

    public final StringPath mgrEmail = createString("mgrEmail");

    public final StringPath mgrEmployeeId = createString("mgrEmployeeId");

    public final DatePath<java.sql.Date> originalVmwHireDate = createDate("originalVmwHireDate", java.sql.Date.class);

    public final StringPath payRateType = createString("payRateType");

    public final StringPath supOrgName = createString("supOrgName");

    public final StringPath timeType = createString("timeType");

    public final StringPath topLevelOrganization = createString("topLevelOrganization");

    public final DateTimePath<java.sql.Timestamp> updatedAt = createDateTime("updatedAt", java.sql.Timestamp.class);

    public final StringPath userName = createString("userName");

    public final StringPath workerLocationCountry = createString("workerLocationCountry");

    public final StringPath workerLocationRegion = createString("workerLocationRegion");

    public final StringPath workerLocationState = createString("workerLocationState");

    public final StringPath workLocation = createString("workLocation");

    public final com.querydsl.sql.PrimaryKey<QUsers> primary = createPrimaryKey(id);

    public final com.querydsl.sql.ForeignKey<QActionAudit> _fKi38ydfl3008sw4gppe4n9d929 = createInvForeignKey(id, "user_id");

    public final com.querydsl.sql.ForeignKey<QActionComments> _fKkrxupq0isuns64jlaiixyshd3 = createInvForeignKey(id, "user_id");

    public final com.querydsl.sql.ForeignKey<QActionFiles> _fKr951w9510m28l7is1kljry08p = createInvForeignKey(id, "user_id");

    public QUsers(String variable) {
        super(QUsers.class, forVariable(variable), "null", "users");
        addMetadata();
    }

    public QUsers(String variable, String schema, String table) {
        super(QUsers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QUsers(String variable, String schema) {
        super(QUsers.class, forVariable(variable), schema, "users");
        addMetadata();
    }

    public QUsers(Path<? extends QUsers> path) {
        super(path.getType(), path.getMetadata(), "null", "users");
        addMetadata();
    }

    public QUsers(PathMetadata metadata) {
        super(QUsers.class, metadata, "null", "users");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(baseSalary, ColumnMetadata.named("base_salary").withIndex(4).ofType(Types.DOUBLE).withSize(22));
        addMetadata(bonus, ColumnMetadata.named("bonus").withIndex(5).ofType(Types.DOUBLE).withSize(22));
        addMetadata(businessTitle, ColumnMetadata.named("business_title").withIndex(6).ofType(Types.VARCHAR).withSize(255));
        addMetadata(companyCode, ColumnMetadata.named("company_code").withIndex(7).ofType(Types.VARCHAR).withSize(255));
        addMetadata(continuousServiceDate, ColumnMetadata.named("continuous_service_date").withIndex(8).ofType(Types.DATE).withSize(10));
        addMetadata(costCenterCode, ColumnMetadata.named("cost_center_code").withIndex(9).ofType(Types.VARCHAR).withSize(255));
        addMetadata(costCenterName, ColumnMetadata.named("cost_center_name").withIndex(10).ofType(Types.VARCHAR).withSize(255));
        addMetadata(cpmUrl, ColumnMetadata.named("cpm_url").withIndex(11).ofType(Types.VARCHAR).withSize(255));
        addMetadata(createdAt, ColumnMetadata.named("created_at").withIndex(2).ofType(Types.TIMESTAMP).withSize(26).notNull());
        addMetadata(currency, ColumnMetadata.named("currency").withIndex(12).ofType(Types.VARCHAR).withSize(5));
        addMetadata(dateOfBirth, ColumnMetadata.named("date_of_birth").withIndex(13).ofType(Types.DATE).withSize(10));
        addMetadata(email, ColumnMetadata.named("email").withIndex(14).ofType(Types.VARCHAR).withSize(255));
        addMetadata(employeeId, ColumnMetadata.named("employee_id").withIndex(15).ofType(Types.VARCHAR).withSize(10));
        addMetadata(employeeType, ColumnMetadata.named("employee_type").withIndex(16).ofType(Types.VARCHAR).withSize(255));
        addMetadata(grade, ColumnMetadata.named("grade").withIndex(17).ofType(Types.VARCHAR).withSize(255));
        addMetadata(hrsWeek, ColumnMetadata.named("hrs_week").withIndex(18).ofType(Types.VARCHAR).withSize(5));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(isActive, ColumnMetadata.named("is_active").withIndex(19).ofType(Types.VARCHAR).withSize(255));
        addMetadata(isPeopleManager, ColumnMetadata.named("is_people_manager").withIndex(20).ofType(Types.BIT).withSize(1));
        addMetadata(jobFamily, ColumnMetadata.named("job_family").withIndex(21).ofType(Types.VARCHAR).withSize(255));
        addMetadata(jobFamilyGroup, ColumnMetadata.named("job_family_group").withIndex(22).ofType(Types.VARCHAR).withSize(255));
        addMetadata(jobProfile, ColumnMetadata.named("job_profile").withIndex(23).ofType(Types.VARCHAR).withSize(255));
        addMetadata(jobProfileName, ColumnMetadata.named("job_profile_name").withIndex(24).ofType(Types.VARCHAR).withSize(255));
        addMetadata(latestVmwHireDate, ColumnMetadata.named("latest_vmw_hire_date").withIndex(25).ofType(Types.DATE).withSize(10));
        addMetadata(legalFirstName, ColumnMetadata.named("legal_first_name").withIndex(26).ofType(Types.VARCHAR).withSize(255));
        addMetadata(legalFullName, ColumnMetadata.named("legal_full_name").withIndex(27).ofType(Types.VARCHAR).withSize(255));
        addMetadata(legalLastName, ColumnMetadata.named("legal_last_name").withIndex(28).ofType(Types.VARCHAR).withSize(255));
        addMetadata(managementLevel, ColumnMetadata.named("management_level").withIndex(29).ofType(Types.VARCHAR).withSize(255));
        addMetadata(mgmtHierarchyLevel1, ColumnMetadata.named("mgmt_hierarchy_level_1").withIndex(30).ofType(Types.VARCHAR).withSize(255));
        addMetadata(mgmtHierarchyLevel10, ColumnMetadata.named("mgmt_hierarchy_level_10").withIndex(31).ofType(Types.VARCHAR).withSize(255));
        addMetadata(mgmtHierarchyLevel11, ColumnMetadata.named("mgmt_hierarchy_level_11").withIndex(32).ofType(Types.VARCHAR).withSize(255));
        addMetadata(mgmtHierarchyLevel12, ColumnMetadata.named("mgmt_hierarchy_level_12").withIndex(33).ofType(Types.VARCHAR).withSize(255));
        addMetadata(mgmtHierarchyLevel2, ColumnMetadata.named("mgmt_hierarchy_level_2").withIndex(34).ofType(Types.VARCHAR).withSize(255));
        addMetadata(mgmtHierarchyLevel3, ColumnMetadata.named("mgmt_hierarchy_level_3").withIndex(35).ofType(Types.VARCHAR).withSize(255));
        addMetadata(mgmtHierarchyLevel4, ColumnMetadata.named("mgmt_hierarchy_level_4").withIndex(36).ofType(Types.VARCHAR).withSize(255));
        addMetadata(mgmtHierarchyLevel5, ColumnMetadata.named("mgmt_hierarchy_level_5").withIndex(37).ofType(Types.VARCHAR).withSize(255));
        addMetadata(mgmtHierarchyLevel6, ColumnMetadata.named("mgmt_hierarchy_level_6").withIndex(38).ofType(Types.VARCHAR).withSize(255));
        addMetadata(mgmtHierarchyLevel7, ColumnMetadata.named("mgmt_hierarchy_level_7").withIndex(39).ofType(Types.VARCHAR).withSize(255));
        addMetadata(mgmtHierarchyLevel8, ColumnMetadata.named("mgmt_hierarchy_level_8").withIndex(40).ofType(Types.VARCHAR).withSize(255));
        addMetadata(mgmtHierarchyLevel9, ColumnMetadata.named("mgmt_hierarchy_level_9").withIndex(41).ofType(Types.VARCHAR).withSize(255));
        addMetadata(mgrEmail, ColumnMetadata.named("mgr_email").withIndex(42).ofType(Types.VARCHAR).withSize(255));
        addMetadata(mgrEmployeeId, ColumnMetadata.named("mgr_employee_id").withIndex(43).ofType(Types.VARCHAR).withSize(255));
        addMetadata(originalVmwHireDate, ColumnMetadata.named("original_vmw_hire_date").withIndex(44).ofType(Types.DATE).withSize(10));
        addMetadata(payRateType, ColumnMetadata.named("pay_rate_type").withIndex(45).ofType(Types.VARCHAR).withSize(255));
        addMetadata(supOrgName, ColumnMetadata.named("sup_org_name").withIndex(46).ofType(Types.VARCHAR).withSize(255));
        addMetadata(timeType, ColumnMetadata.named("time_type").withIndex(47).ofType(Types.VARCHAR).withSize(255));
        addMetadata(topLevelOrganization, ColumnMetadata.named("top_level_organization").withIndex(48).ofType(Types.VARCHAR).withSize(255));
        addMetadata(updatedAt, ColumnMetadata.named("updated_at").withIndex(3).ofType(Types.TIMESTAMP).withSize(26));
        addMetadata(userName, ColumnMetadata.named("user_name").withIndex(49).ofType(Types.VARCHAR).withSize(255));
        addMetadata(workerLocationCountry, ColumnMetadata.named("worker_location_country").withIndex(50).ofType(Types.VARCHAR).withSize(255));
        addMetadata(workerLocationRegion, ColumnMetadata.named("worker_location_region").withIndex(51).ofType(Types.VARCHAR).withSize(255));
        addMetadata(workerLocationState, ColumnMetadata.named("worker_location_state").withIndex(52).ofType(Types.VARCHAR).withSize(255));
        addMetadata(workLocation, ColumnMetadata.named("work_location").withIndex(53).ofType(Types.VARCHAR).withSize(255));
    }

}

