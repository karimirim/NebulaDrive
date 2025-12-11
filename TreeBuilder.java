public class TreeBuilder {

    /** Build sample USER root with multiple disks. */
    public Node buildSample() {
        Node user = new Node("tania", "2025-09-13", Node.Type.USER);

        Node diskC = new Node("Local Disk C", "2024-09-13", Node.Type.DISK);
        Node diskD = new Node("Local Disk D", "2024-09-13", Node.Type.DISK);
        Node diskE = new Node("Local Disk E", "2024-09-13", Node.Type.DISK);

        user.addChild(diskC);
        user.addChild(diskD);
        user.addChild(diskE);

        Node desktop = new Node("Desktop", "2025-09-13", Node.Type.FOLDER);// di disk C
        Node download = new Node("Download", "2025-09-13", Node.Type.FOLDER);// di disk C
        Node document = new Node("Document", "2025-09-13", Node.Type.FOLDER);// di disk C
        Node pictures = new Node("Pictures", "2025-09-13", Node.Type.FOLDER);// di disk C
        Node music = new Node("Music", "2025-09-13", Node.Type.FOLDER);// di disk C
        Node videos = new Node("Videos", "2025-09-13", Node.Type.FOLDER);// di disk C

        Node kampus = new Node("Kampus", "2025-09-14", Node.Type.FOLDER); // di disk D
        Node design = new Node("Design", "2025-09-14", Node.Type.FOLDER); // di disk D

        Node genshin = new Node("Genshin Impact", "2025-09-16", Node.Type.FOLDER); // di disk E
        Node valorant = new Node("Valorant", "2025-09-16", Node.Type.FOLDER); // di disk E
        Node bluestacks = new Node("BlueStacks", "2025-09-16", Node.Type.FOLDER); // di disk E

        Node asset3d = new Node("Asset3D_Karim", "2025-09-21", Node.Type.FOLDER); // ke download
        Node nebula = new Node("NebulaDrive_Fix_2_Fixx", "2025-12-12", Node.Type.FOLDER); // ke download
        Node freeAsset = new Node("AssetDesign", "2025-09-21", Node.Type.FOLDER); // ke download
        Node screenshot = new Node("Screenshoot", "2025-09-15", Node.Type.FOLDER); // ke pictures
        Node cam1 = new Node("Camera", "2025-09-15", Node.Type.FOLDER); // ke pictures
        Node cam2 = new Node("Camera", "2025-09-15", Node.Type.FOLDER); // ke videos

        Node sms1 = new Node("Semester1", "2025-09-14", Node.Type.FOLDER); // ke kampus
        Node sms2 = new Node("Semester2", "2025-09-14", Node.Type.FOLDER); // ke kampus
        Node sms3 = new Node("Semester3", "2025-09-14", Node.Type.FOLDER); // ke kampus

        Node calc = new Node("Kalkulus", "2025-09-14", Node.Type.FOLDER); // ke semester 1
        Node kap = new Node("KAP", "2025-09-14", Node.Type.FOLDER); // ke semester 1
        Node kwn = new Node("Kewirausahaan", "2025-09-14", Node.Type.FOLDER); // ke semester 1
        Node praktikum1 = new Node("Praktikum", "2025-09-14", Node.Type.FOLDER); // ke semester 1

        Node alpro = new Node("Algoritma Pemrograman", "2025-09-14", Node.Type.FOLDER); // ke semester 2
        Node alin = new Node("Aljabar Linear", "2025-09-14", Node.Type.FOLDER); // ke semester 2
        Node probstat = new Node("Probabilitas dan Statistik", "2025-09-14", Node.Type.FOLDER); // ke semester 2
        Node praktikum2 = new Node("Praktikum", "2025-09-14", Node.Type.FOLDER); // ke semester 2

        Node algodat = new Node("Algoritma dan Struktur Data", "2025-09-14", Node.Type.FOLDER); // ke semester 3
        Node sbd = new Node("Sistem Basis Data", "2025-09-14", Node.Type.FOLDER); // ke semester 3
        Node imk = new Node("Interaksi Manusia dan Komputer", "2025-09-14", Node.Type.FOLDER); // ke semester 3
        Node praktikum3 = new Node("Praktikum1", "2025-09-14", Node.Type.FOLDER); // ke semester 3
        Node praktikum4 = new Node("Praktikum2", "2025-09-14", Node.Type.FOLDER); // ke semester 3
        Node praktikum5 = new Node("Praktikum3", "2025-09-14", Node.Type.FOLDER); // ke semester 3

        Node corel = new Node("CorelDraw", "2025-09-14", Node.Type.FOLDER); // ke design
        Node photoshop = new Node("Photoshop", "2025-09-14", Node.Type.FOLDER); // ke design
        Node illustrator = new Node("Illustrator", "2025-09-14", Node.Type.FOLDER); // ke design

        Node bin = new Node("Recycle Bin", "2025-09-13", Node.Type.FILE, 20);// ke desktop

        // file design
        Node logo = new Node("Logo_Project.png", "2025-09-14", Node.Type.FILE);
        Node poster = new Node("Poster_Event.cdr", "2025-09-14", Node.Type.FILE);
        Node banner = new Node("Banner_Competition.psd", "2025-09-14", Node.Type.FILE);
        Node iconPack = new Node("Icon_Pack.ai", "2025-09-14", Node.Type.FILE);
        Node mockup = new Node("Mockup_SocialMedia.psd", "2025-09-14", Node.Type.FILE);
        Node layout = new Node("Layout_Magazine.indd", "2025-09-14", Node.Type.FILE);
        Node brushpack = new Node("BrushPack_ABR.abr", "2025-09-14", Node.Type.FILE);
        Node colorPalette = new Node("Color_Palette.json", "2025-09-14", Node.Type.FILE);

        // SEMESTER 1 EXTRA FILES
        Node kalkulusLatihan1 = new Node("Latihan_Kalkulus_1.pdf", "2025-09-15", Node.Type.FILE, 95);
        Node kalkulusLatihan2 = new Node("Latihan_Kalkulus_2.pdf", "2025-09-17", Node.Type.FILE, 120);
        Node kalkulusUTS = new Node("UTS_Kalkulus_2025.pdf", "2025-10-05", Node.Type.FILE, 210);
        Node kalkulusGrafik = new Node("Grafik_Pertemuan4.png", "2025-09-19", Node.Type.FILE, 480);

        Node kapRingkasan1 = new Node("Ringkasan_KAP_BAB1.docx", "2025-09-14", Node.Type.FILE, 60);
        Node kapRingkasan2 = new Node("Ringkasan_KAP_BAB2.docx", "2025-09-16", Node.Type.FILE, 65);
        Node kapLatihan = new Node("Latihan_Soal_KAP.pdf", "2025-09-18", Node.Type.FILE, 130);

        Node kwnPitchDeck = new Node("PitchDeck_UMKM.pptx", "2025-09-25", Node.Type.FILE, 700);
        Node kwnIdeBisnis = new Node("Ide_Bisnis.xlsx", "2025-09-20", Node.Type.FILE, 50);

        Node praktikum1Kode1 = new Node("kode_praktikum1.java", "2025-09-15", Node.Type.FILE, 4);
        Node praktikum1Kode2 = new Node("kode_praktikum1_v2.java", "2025-09-16", Node.Type.FILE, 5);
        Node praktikum1Foto = new Node("foto_praktikum1.jpg", "2025-09-17", Node.Type.FILE, 900);

        // SEMESTER 2 EXTRA FILES
        Node alproTugasFungsi = new Node("Tugas_Fungsi_Alpro.java", "2025-09-22", Node.Type.FILE, 7);
        Node alproTugasLoop = new Node("Tugas_Looping_Alpro.java", "2025-09-24", Node.Type.FILE, 6);
        Node alproProject = new Node("MiniProject_Alpro.zip", "2025-10-03", Node.Type.FILE, 500);

        Node alinLatihanMatrix1 = new Node("Latihan_Matrix_1.pdf", "2025-09-19", Node.Type.FILE, 110);
        Node alinLatihanMatrix2 = new Node("Latihan_Matrix_2.pdf", "2025-09-22", Node.Type.FILE, 115);
        Node alinUTS = new Node("UTS_Aljabar_Linear.pdf", "2025-10-06", Node.Type.FILE, 190);

        Node probstatDataset = new Node("Dataset_Probstat.csv", "2025-09-23", Node.Type.FILE, 340);
        Node probstatGrafik = new Node("Grafik_Distribusi.png", "2025-09-26", Node.Type.FILE, 500);
        Node probstatSimulasi = new Node("Simulasi_Distribusi_Normal.py", "2025-09-28", Node.Type.FILE, 9);

        Node praktikum2Hasil = new Node("Hasil_Praktikum_Sem2.docx", "2025-09-27", Node.Type.FILE, 84);
        Node praktikum2Record = new Node("Record_Praktikum_Sem2.mp4", "2025-09-28", Node.Type.FILE, 8500);

        // SEMESTER 3 EXTRA FILES (PALING BANYAK)
        Node algodatTugasStack = new Node("Tugas_Stack_Algodat.java", "2025-09-20", Node.Type.FILE, 7);
        Node algodatTugasQueue = new Node("Tugas_Queue_Algodat.java", "2025-09-22", Node.Type.FILE, 8);
        Node algodatTugasTree = new Node("Tugas_Tree_Algodat.java", "2025-09-25", Node.Type.FILE, 10);
        Node algodatQuiz1 = new Node("Quiz_Algodat_1.pdf", "2025-09-26", Node.Type.FILE, 90);
        Node algodatLatihanSorting = new Node("Latihan_Sorting.java", "2025-09-18", Node.Type.FILE, 5);
        Node algodatNote = new Node("Catatan_Algodat.pdf", "2025-09-16", Node.Type.FILE, 140);

        Node sbdTugasJoin = new Node("Tugas_Join_SBD.sql", "2025-09-21", Node.Type.FILE, 12);
        Node sbdTugasNormalisasi = new Node("Normalisasi_Tabel_SBD.docx", "2025-09-23", Node.Type.FILE, 100);
        Node sbdLatihanQuery = new Node("Latihan_Query_SBD.sql", "2025-09-24", Node.Type.FILE, 15);
        Node sbdPraktikumRecord = new Node("Record_Praktikum_SBD.mp4", "2025-09-25", Node.Type.FILE, 7800);
        Node sbdUTS = new Node("UTS_SBD_2025.pdf", "2025-10-07", Node.Type.FILE, 220);
        Node sbdRangkuman = new Node("Rangkuman_SBD.docx", "2025-09-20", Node.Type.FILE, 90);

        Node imkPersona = new Node("Persona_User_IMK.pdf", "2025-09-17", Node.Type.FILE, 200);
        Node imkStoryboard = new Node("Storyboard_IMK.png", "2025-09-18", Node.Type.FILE, 540);
        Node imkPrototype = new Node("Prototype_IMK.fig", "2025-09-22", Node.Type.FILE, 2300);
        Node imkJournal = new Node("Jurnal_IMK.docx", "2025-09-19", Node.Type.FILE, 120);
        Node imkUts = new Node("UTS_IMK_2025.pdf", "2025-10-04", Node.Type.FILE, 210);

        Node praktikum3Dataset = new Node("Dataset_Praktikum1.csv", "2025-09-14", Node.Type.FILE, 310);
        Node praktikum3Record = new Node("Record_Praktikum1.mp4", "2025-09-15", Node.Type.FILE, 6900);
        Node praktikum3Feedback = new Node("Feedback_Praktikum1.txt", "2025-09-17", Node.Type.FILE, 2);

        Node praktikum4CodeFix = new Node("Code_Praktikum2_Fix.java", "2025-09-23", Node.Type.FILE, 7);
        Node praktikum4Screenshot = new Node("Screenshot_Praktikum2.png", "2025-09-24", Node.Type.FILE, 410);

        Node praktikum5Dataset = new Node("Dataset_Praktikum3.csv", "2025-09-27", Node.Type.FILE, 380);
        Node praktikum5Notes = new Node("Notes_Praktikum3.docx", "2025-09-28", Node.Type.FILE, 70);
        Node praktikum5Debug = new Node("Debug_Log_Praktikum3.txt", "2025-09-29", Node.Type.FILE, 3);

        Node tugasRandom1 = new Node("Tugas_Pengganti.docx", "2025-09-20", Node.Type.FILE, 80);
        Node tugasRandom2 = new Node("File_BAB1_Revisi.pdf", "2025-09-22", Node.Type.FILE, 150);
        Node tugasRandom3 = new Node("Screenshot_Kelas_Online.png", "2025-09-19", Node.Type.FILE, 500);
        Node tugasRandom4 = new Node("Catatan_Kuliah_21Sept.docx", "2025-09-21", Node.Type.FILE, 60);
        Node tugasRandom5 = new Node("Absensi_Kelas.xlsx", "2025-09-22", Node.Type.FILE, 30);
        Node tugasRandom6 = new Node("Draft_KomentarDosen.txt", "2025-09-23", Node.Type.FILE, 1);
        Node tugasRandom7 = new Node("Revisi_Tugas_Algodat.docx", "2025-09-24", Node.Type.FILE, 75);
        Node tugasRandom8 = new Node("Template_Laporan.docx", "2025-09-15", Node.Type.FILE, 50);
        Node tugasRandom9 = new Node("Hasil_Kompilasi.java", "2025-09-16", Node.Type.FILE, 3);
        Node tugasRandom10 = new Node("Data_Peserta_Project.csv", "2025-09-26", Node.Type.FILE, 260);

        // ================= DISK C =================
        diskC.addChild(desktop);
        diskC.addChild(download);
        diskC.addChild(document);
        diskC.addChild(pictures);
        diskC.addChild(music);
        diskC.addChild(videos);

        // Desktop content
        desktop.addChild(bin);

        // Download content
        download.addChild(asset3d);
        download.addChild(nebula);
        download.addChild(freeAsset);

        // Pictures content
        pictures.addChild(screenshot);
        pictures.addChild(cam1);

        // Videos content
        videos.addChild(cam2);

        // ================= DISK D =================
        diskD.addChild(kampus);
        diskD.addChild(design);

        // Design → Software
        design.addChild(corel);
        design.addChild(photoshop);
        design.addChild(illustrator);

        corel.addChild(poster); 
        corel.addChild(banner); 
        corel.addChild(layout); 
        photoshop.addChild(mockup); 
        photoshop.addChild(brushpack);
        photoshop.addChild(logo); 
        illustrator.addChild(iconPack); 
        illustrator.addChild(colorPalette); 
        illustrator.addChild(logo); 

        // Kampus → Semester
        kampus.addChild(sms1);
        kampus.addChild(sms2);
        kampus.addChild(sms3);

        // ========== SEMESTER 1 ==========
        sms1.addChild(calc); 
        sms1.addChild(kap);
        sms1.addChild(kwn);
        sms1.addChild(praktikum1);

        // Kalkulus files
        calc.addChild(kalkulusLatihan1);
        calc.addChild(kalkulusLatihan2);
        calc.addChild(kalkulusUTS);
        calc.addChild(kalkulusGrafik);

        // KAP files
        kap.addChild(kapRingkasan1);
        kap.addChild(kapRingkasan2);
        kap.addChild(kapLatihan);

        // Kewirausahaan files
        kwn.addChild(kwnPitchDeck);
        kwn.addChild(kwnIdeBisnis);

        // Praktikum 1 files
        praktikum1.addChild(praktikum1Kode1);
        praktikum1.addChild(praktikum1Kode2);
        praktikum1.addChild(praktikum1Foto);

        // ========== SEMESTER 2 ==========
        sms2.addChild(alpro);
        sms2.addChild(alin);
        sms2.addChild(probstat);
        sms2.addChild(praktikum2);

        // Alpro files
        alpro.addChild(alproTugasFungsi);
        alpro.addChild(alproTugasLoop);
        alpro.addChild(alproProject);

        // Aljabar Linear files
        alin.addChild(alinLatihanMatrix1);
        alin.addChild(alinLatihanMatrix2);
        alin.addChild(alinUTS);

        // Probstat files
        probstat.addChild(probstatDataset);
        probstat.addChild(probstatGrafik);
        probstat.addChild(probstatSimulasi);

        // Praktikum sem 2 files
        praktikum2.addChild(praktikum2Hasil);
        praktikum2.addChild(praktikum2Record);

        // ========== SEMESTER 3 ==========
        sms3.addChild(algodat);
        sms3.addChild(sbd);
        sms3.addChild(imk);
        sms3.addChild(praktikum3);
        sms3.addChild(praktikum4);
        sms3.addChild(praktikum5);

        // Algodat files
        algodat.addChild(algodatTugasStack);
        algodat.addChild(algodatTugasQueue);
        algodat.addChild(algodatTugasTree);
        algodat.addChild(algodatQuiz1);
        algodat.addChild(algodatLatihanSorting);
        algodat.addChild(algodatNote);

        // SBD files
        sbd.addChild(sbdTugasJoin);
        sbd.addChild(sbdTugasNormalisasi);
        sbd.addChild(sbdLatihanQuery);
        sbd.addChild(sbdPraktikumRecord);
        sbd.addChild(sbdUTS);
        sbd.addChild(sbdRangkuman);

        // IMK files
        imk.addChild(imkPersona);
        imk.addChild(imkStoryboard);
        imk.addChild(imkPrototype);
        imk.addChild(imkJournal);
        imk.addChild(imkUts);

        // Praktikum 3 files
        praktikum3.addChild(praktikum3Dataset);
        praktikum3.addChild(praktikum3Record);
        praktikum3.addChild(praktikum3Feedback);

        // Praktikum 4 files
        praktikum4.addChild(praktikum4CodeFix);
        praktikum4.addChild(praktikum4Screenshot);

        // Praktikum 5 files
        praktikum5.addChild(praktikum5Dataset);
        praktikum5.addChild(praktikum5Notes);
        praktikum5.addChild(praktikum5Debug);

        // Bonus random kampus biar makin chaos
        kampus.addChild(tugasRandom1);
        kampus.addChild(tugasRandom2);
        kampus.addChild(tugasRandom3);
        kampus.addChild(tugasRandom4);
        kampus.addChild(tugasRandom5);
        kampus.addChild(tugasRandom6);
        kampus.addChild(tugasRandom7);
        kampus.addChild(tugasRandom8);
        kampus.addChild(tugasRandom9);
        kampus.addChild(tugasRandom10);

        // ================= DISK E =================
        diskE.addChild(genshin);
        diskE.addChild(valorant);
        diskE.addChild(bluestacks);

        return user;
    }

}