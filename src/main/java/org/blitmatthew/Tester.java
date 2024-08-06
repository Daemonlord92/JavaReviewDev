package org.blitmatthew;

public final class Tester extends People{
    private String cert;

    public Tester(String name, Integer age, String cert) {
        super(name, age);
        this.cert = cert;
    }

    public String getCert() {
        return cert;
    }

    public void setCert(String cert) {
        this.cert = cert;
    }
}
