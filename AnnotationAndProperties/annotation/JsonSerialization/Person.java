package annotation.JsonSerialization;

import annotation.JsonSerialization.excep.JsonSerializationException;

@JsonSerializable
public class Person {
    @JsonElement(jsonType = JsonValueType.STRING)
    private String firstName;

    @JsonElement(jsonType = JsonValueType.STRING)
    private String lastName;
    
    @JsonElement(jsonType = JsonValueType.STRING)
    private String address;
    
    @JsonElement(jsonType = JsonValueType.NUMBER)
    private int age;

    @JsonElement
    private String email;
    
    @JsonElement(jsonType = JsonValueType.BOOLEAN)
    private boolean sex;

    @DefaultValue
    private void init() {
        this.firstName = this.firstName.substring(0, 1).toUpperCase() + this.firstName.substring(1);
        this.lastName = this.lastName.substring(0, 1).toUpperCase() + this.lastName.substring(1);
    }

    public Person() {
        init();
    }
    
    // Reflection
    private void checkIfSerializable(Object obj) {
        if (obj == null) {
            try {
                throw new JsonSerializationException("The object is null.");
            } catch (JsonSerializationException e) {
                e.printStackTrace();
            }
        }

        Class<?> cls = obj.getClass();
        if (cls.isAnnotationPresent(JsonSerializable.class)) {
            try {
                throw new JsonSerializationException("The class " + cls.getName() + " is not serialized.");
            } catch (JsonSerializationException e) {
            }
        }
    }
}
