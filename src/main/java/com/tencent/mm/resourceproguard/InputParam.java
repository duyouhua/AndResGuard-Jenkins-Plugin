package com.tencent.mm.resourceproguard;

import java.io.File;
import java.util.List;

/**
 * Created by sun on 1/9/16.
 */
public class InputParam {
    public final File              mappingFile;
    public final boolean           use7zip;
    public final boolean           keepRoot;
    public final String            metaName;
    public final List<String> whiteList;
    public final List<String> compressFilePattern;
    public final String            apkPath;
    public final String            outFolder;
    public final File              signFile;
    public final String            keypass;
    public final String            storealias;
    public final String            storepass;


    private InputParam(
        File mappingFile,
        boolean use7zip,
        boolean keepRoot,
        List<String> whiteList,
        List<String> compressFilePattern,
        String apkPath,
        String outFolder,
        File signFile,
        String keypass,
        String storealias,
        String storepass,
        String metaName
    ) {
        this.mappingFile = mappingFile;
        this.use7zip = use7zip;
        this.keepRoot = keepRoot;
        this.whiteList = whiteList;
        this.compressFilePattern = compressFilePattern;
        this.apkPath = apkPath;
        this.outFolder = outFolder;
        this.signFile = signFile;
        this.keypass = keypass;
        this.storealias = storealias;
        this.storepass = storepass;
        this.metaName = metaName;
    }

    public static class Builder {
        private File              mappingFile;
        private boolean           use7zip;
        private boolean           keepRoot;
        private List<String> whiteList;
        private List<String> compressFilePattern;
        private String            apkPath;
        private String            outFolder;
        private File              signFile;
        private String            keypass;
        private String            storealias;
        private String            storepass;
        private String            metaName;

        public Builder() {
            use7zip = false;
            keepRoot = false;
        }

        public Builder setMappingFile(File mappingFile) {
            this.mappingFile = mappingFile;
            return this;
        }

        public Builder setUse7zip(boolean use7zip) {
            this.use7zip = use7zip;
            return this;
        }

        public Builder setKeepRoot(boolean keepRoot) {
            this.keepRoot = keepRoot;
            return this;
        }

        public Builder setWhiteList(List<String> whiteList) {
            this.whiteList = whiteList;
            return this;
        }

        public Builder setCompressFilePattern(List<String> compressFilePattern) {
            this.compressFilePattern = compressFilePattern;
            return this;
        }

        public Builder setApkPath(String apkPath) {
            this.apkPath = apkPath;
            return this;
        }

        public Builder setOutBuilder(String outFolder) {
            this.outFolder = outFolder;
            return this;
        }

        public Builder setSignFile(File signFile) {
            this.signFile = signFile;
            return this;
        }

        public Builder setKeypass(String keypass) {
            this.keypass = keypass;
            return this;
        }

        public Builder setStorealias(String storealias) {
            this.storealias = storealias;
            return this;
        }

        public Builder setStorepass(String storepass) {
            this.storepass = storepass;
            return this;
        }

        public Builder setMetaName(String metaName) {
            this.metaName = metaName;
            return this;
        }

        public InputParam create() {
            return new InputParam(
                mappingFile,
                use7zip,
                keepRoot,
                whiteList,
                compressFilePattern,
                apkPath,
                outFolder,
                signFile,
                keypass,
                storealias,
                storepass,
                metaName
            );
        }
    }
}
