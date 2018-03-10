package tito.example.com.environ_mumbai_hackathon.Model;

import java.util.List;

/**
 * Created by tito on 10/3/18.
 */

public class Data {
    private String index_name;
    private String title;
    private String desc;
    private String created;
    private String updated;
    private String visualizable;
    private String source;
    private String org_type;
    private List<String> org;
    private List<String> sector;
    private String catalog_uuid;
    private String status;
    private String message;
    private String total;
    private String count;
    private String limit;
    private List<Field> fields;
    private List<Records> records;
    private String version;

    public Data() {
    }

    public Data(String index_name, String title, String desc, String created, String updated, String visualizable, String source, String org_type, List<String> org, List<String> sector, String catalog_uuid, String status, String message, String total, String count, String limit, List<Field> fields, List<Records> records, String version) {
        this.index_name = index_name;
        this.title = title;
        this.desc = desc;
        this.created = created;
        this.updated = updated;
        this.visualizable = visualizable;
        this.source = source;
        this.org_type = org_type;
        this.org = org;
        this.sector = sector;
        this.catalog_uuid = catalog_uuid;
        this.status = status;
        this.message = message;
        this.total = total;
        this.count = count;
        this.limit = limit;
        this.fields = fields;
        this.records = records;
        this.version = version;
    }

    public String getIndex_name() {
        return index_name;
    }

    public void setIndex_name(String index_name) {
        this.index_name = index_name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getVisualizable() {
        return visualizable;
    }

    public void setVisualizable(String visualizable) {
        this.visualizable = visualizable;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getOrg_type() {
        return org_type;
    }

    public void setOrg_type(String org_type) {
        this.org_type = org_type;
    }

    public List<String> getOrg() {
        return org;
    }

    public void setOrg(List<String> org) {
        this.org = org;
    }

    public List<String> getSector() {
        return sector;
    }

    public void setSector(List<String> sector) {
        this.sector = sector;
    }

    public String getCatalog_uuid() {
        return catalog_uuid;
    }

    public void setCatalog_uuid(String catalog_uuid) {
        this.catalog_uuid = catalog_uuid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public List<Records> getRecords() {
        return records;
    }

    public void setRecords(List<Records> records) {
        this.records = records;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
