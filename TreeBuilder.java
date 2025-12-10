public class TreeBuilder {

    /** Build sample USER root with multiple disks. */
    public Node buildSample() {
        Node user = new Node("tania", "2025-09-13", Node.Type.USER);

        Node diskC = new Node("Local Disk C", "2025-09-13", Node.Type.DISK);
        Node diskD = new Node("Local Disk D", "2025-09-13", Node.Type.DISK);
        Node diskE = new Node("Local Disk E", "2025-09-13", Node.Type.DISK);
        Node diskF = new Node("Local Disk F", "2025-09-14", Node.Type.DISK);
        Node diskG = new Node("Local Disk G", "2025-09-15", Node.Type.DISK);
        Node diskH = new Node("Local Disk H", "2025-09-16", Node.Type.DISK);
        Node diskI = new Node("Local Disk I", "2025-09-17", Node.Type.DISK);
        Node diskJ = new Node("Local Disk J", "2025-09-18", Node.Type.DISK);
        Node diskK = new Node("Local Disk K", "2025-09-19", Node.Type.DISK);
        Node diskL = new Node("Local Disk L", "2025-09-20", Node.Type.DISK);
        Node diskM = new Node("Local Disk M", "2025-09-21", Node.Type.DISK);

        user.addChild(diskC);
        user.addChild(diskD);
        user.addChild(diskE);
        user.addChild(diskF);
        user.addChild(diskG);
        user.addChild(diskH);
        user.addChild(diskI);
        user.addChild(diskJ);
        user.addChild(diskK);
        user.addChild(diskL);
        user.addChild(diskM);

        Node docs = new Node("Documents", "2025-12-02", Node.Type.FOLDER);
        Node pics = new Node("Pictures", "2025-12-02", Node.Type.FOLDER);
        Node src = new Node("src", "2025-12-03", Node.Type.FOLDER);
        Node assets = new Node("assets", "2025-12-03", Node.Type.FOLDER);
        Node scripts = new Node("scripts", "2025-12-04", Node.Type.FOLDER);
        Node config = new Node("config", "2025-12-04", Node.Type.FOLDER);
        Node includes = new Node("includes", "2025-12-05", Node.Type.FOLDER);
        Node libs = new Node("libs", "2025-12-05", Node.Type.FOLDER);
        Node bin = new Node("bin", "2025-12-06", Node.Type.FOLDER);
        Node modules = new Node("modules", "2025-12-06", Node.Type.FOLDER);
        Node resources = new Node("resources", "2025-12-07", Node.Type.FOLDER);
        Node temp = new Node("temp", "2025-12-08", Node.Type.FOLDER);
        Node cache = new Node("cache", "2025-12-08", Node.Type.FOLDER);

        Node f1 = new Node("Resume.pdf", "2025-02-15", Node.Type.FILE, 300);
        Node f2 = new Node("Notes.txt", "2025-02-16", Node.Type.FILE, 5);
        Node img = new Node("photo.png", "2025-02-12", Node.Type.FILE, 2000);
        Node main = new Node("Main.java", "2025-12-03", Node.Type.FILE, 12);
        Node f3 = new Node("Report.docx", "2025-02-17", Node.Type.FILE, 120);
        Node f4 = new Node("Budget.xlsx", "2025-02-18", Node.Type.FILE, 220);
        Node f5 = new Node("Presentation.pptx", "2025-02-19", Node.Type.FILE, 450);
        Node f6 = new Node("todo.txt", "2025-02-20", Node.Type.FILE, 2);
        Node f7 = new Node("design.psd", "2025-02-21", Node.Type.FILE, 15000);
        Node f8 = new Node("logo.svg", "2025-02-22", Node.Type.FILE, 300);
        Node f9 = new Node("script.js", "2025-02-23", Node.Type.FILE, 25);
        Node f10 = new Node("style.css", "2025-02-24", Node.Type.FILE, 14);
        Node f11 = new Node("README.md", "2025-02-25", Node.Type.FILE, 6);
        Node f12 = new Node("database.db", "2025-02-26", Node.Type.FILE, 9000);

        diskC.addChild(docs);
        diskC.addChild(pics);

        diskD.addChild(src);
        src.addChild(assets);
        src.addChild(scripts);
        src.addChild(config);
        src.addChild(includes);
        src.addChild(libs);
        src.addChild(bin);
        src.addChild(modules);
        src.addChild(resources);
        src.addChild(temp);
        src.addChild(cache);

        docs.addChild(f1);
        docs.addChild(f2);
        docs.addChild(f3);
        docs.addChild(f4);
        docs.addChild(f5);

        pics.addChild(img);

        src.addChild(main);
        scripts.addChild(f9);
        assets.addChild(f8);
        config.addChild(f11);
        libs.addChild(f12);
        includes.addChild(f6);
        bin.addChild(f10);
        resources.addChild(f7);
        
        return user;
    }

    /** Add a node by path, path format: "/Local Disk C/Documents" */
    public boolean addByPath(Node root, String path, Node toAdd) {
        if (root == null || path == null || toAdd == null) return false;
        String p = path.trim();
        if (p.startsWith("/")) p = p.substring(1);
        if (p.isEmpty()) {
            if (root.getType() == Node.Type.USER || root.getType() == Node.Type.DISK || root.getType() == Node.Type.FOLDER) {
                root.addChild(toAdd);
                return true;
            }
            return false;
        }
        String[] parts = p.split("/");
        Node cur = root;
        for (String part : parts) {
            if (cur.getChildren() == null) return false;
            Node next = null;
            for (int i = 0; i < cur.getChildren().size(); i++) {
                Node c = cur.getChildren().get(i);
                if (c.getName().equals(part) && (c.getType() == Node.Type.USER || c.getType() == Node.Type.DISK || c.getType() == Node.Type.FOLDER)) {
                    next = c; break;
                }
            }
            if (next == null) return false;
            cur = next;
        }
        if (cur.getType() == Node.Type.USER || cur.getType() == Node.Type.DISK || cur.getType() == Node.Type.FOLDER) {
            cur.addChild(toAdd);
            return true;
        }
        return false;
    }
}
