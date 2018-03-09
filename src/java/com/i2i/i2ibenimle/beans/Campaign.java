
package com.i2i.i2ibenimle.beans;

/**
 *
 * @author said özgat
 */
public class Campaign {
    private int id;
    private String name;
    private String description;
    private String rules;

    public Campaign(int id, String name, String description, String rules) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.rules = rules;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }
    
    
    
    
}
