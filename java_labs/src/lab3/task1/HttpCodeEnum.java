package lab3.task1;

public enum HttpCodeEnum {
    ERROR5("Code 500"), ERROR4("Code 400"),  ERROR2("Code 200");

    private final String code;

    HttpCodeEnum(final String code){
        this.code = code;
    }

    public String getCode(){ return code;}
}

