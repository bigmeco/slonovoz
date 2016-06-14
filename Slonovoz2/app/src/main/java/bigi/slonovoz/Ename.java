package bigi.slonovoz;

public enum Ename {
    GAMZ4m(590),
    GAMZ3m(490);


    private final int levelCode;
    Ename(int levelCode) {
        this.levelCode = levelCode;
    }

    public int getCode() {
        return this.levelCode;
    }

}