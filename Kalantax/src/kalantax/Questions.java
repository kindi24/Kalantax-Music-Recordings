package kalantax;

/**
 *
 * @author 30698
 */
public class Questions extends javax.swing.JFrame {

    /**
     * Creates new form InsertEdit
     */
    public Questions() {
        initComponents();
        this.setTitle("Kalantax-Search");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        Return = new javax.swing.JButton();
        Return1 = new javax.swing.JButton();
        First = new javax.swing.JButton();
        artists = new javax.swing.JButton();
        songs = new javax.swing.JButton();
        soundrecorder = new javax.swing.JButton();
        recordings = new javax.swing.JButton();
        company = new javax.swing.JLabel();
        Artist = new javax.swing.JLabel();
        song = new javax.swing.JLabel();
        mic = new javax.swing.JLabel();
        engineer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.cyan);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Select a table to search");

        Return.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Return.setForeground(java.awt.Color.magenta);
        Return.setText("Edit");
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });

        Return1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Return1.setForeground(java.awt.Color.magenta);
        Return1.setText("Return");
        Return1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Return1ActionPerformed(evt);
            }
        });

        First.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        First.setForeground(java.awt.Color.magenta);
        First.setText("Record Company");
        First.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstActionPerformed(evt);
            }
        });

        artists.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        artists.setForeground(java.awt.Color.magenta);
        artists.setText("Artists");
        artists.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artistsActionPerformed(evt);
            }
        });

        songs.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        songs.setForeground(java.awt.Color.magenta);
        songs.setText("Songs");
        songs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songsActionPerformed(evt);
            }
        });

        soundrecorder.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        soundrecorder.setForeground(java.awt.Color.magenta);
        soundrecorder.setText("Sound Engineer");
        soundrecorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soundrecorderActionPerformed(evt);
            }
        });

        recordings.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        recordings.setForeground(java.awt.Color.magenta);
        recordings.setText("Sound Recordings");
        recordings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordingsActionPerformed(evt);
            }
        });

        company.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/company-construction-32.png"))); // NOI18N
        company.setText("jLabel1");
        company.setMaximumSize(new java.awt.Dimension(32, 32));
        company.setMinimumSize(new java.awt.Dimension(32, 32));
        company.setPreferredSize(new java.awt.Dimension(32, 32));

        Artist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/music-276-32.png"))); // NOI18N
        Artist.setText("jLabel1");
        Artist.setMaximumSize(new java.awt.Dimension(32, 32));
        Artist.setMinimumSize(new java.awt.Dimension(32, 32));
        Artist.setPreferredSize(new java.awt.Dimension(32, 32));

        song.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guitar-25-32.png"))); // NOI18N
        song.setText("jLabel1");
        song.setMaximumSize(new java.awt.Dimension(32, 32));
        song.setMinimumSize(new java.awt.Dimension(32, 32));
        song.setPreferredSize(new java.awt.Dimension(32, 32));

        mic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/microphone-154-32.png"))); // NOI18N
        mic.setText("jLabel1");
        mic.setMaximumSize(new java.awt.Dimension(32, 32));
        mic.setMinimumSize(new java.awt.Dimension(32, 32));
        mic.setPreferredSize(new java.awt.Dimension(32, 32));

        engineer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/responsible-person-selection-32.png"))); // NOI18N
        engineer.setText("jLabel1");
        engineer.setMaximumSize(new java.awt.Dimension(32, 32));
        engineer.setMinimumSize(new java.awt.Dimension(32, 32));
        engineer.setPreferredSize(new java.awt.Dimension(32, 32));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Return, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Return1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 51, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(soundrecorder, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(artists, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(First, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                        .addComponent(songs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(recordings, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(company, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mic, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(engineer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(song, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Artist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(52, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(First, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(artists, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(songs, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(soundrecorder, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(recordings, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Return)
                            .addComponent(Return1))
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(company, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(song, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Artist, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(engineer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mic, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        InsertEdit menu = new InsertEdit();
        menu.setVisible(true);
    }//GEN-LAST:event_ReturnActionPerformed

    private void Return1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Return1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        MAIN menu = new MAIN();
        menu.setVisible(true);
    }//GEN-LAST:event_Return1ActionPerformed

    private void recordingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordingsActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        QRecordings recordings = new QRecordings();
        recordings.setVisible(true);
    }//GEN-LAST:event_recordingsActionPerformed

    private void soundrecorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soundrecorderActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        QSoundEng soundeng = new QSoundEng();
        soundeng.setVisible(true);
    }//GEN-LAST:event_soundrecorderActionPerformed

    private void songsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songsActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        QSongs songs = new QSongs();
        songs.setVisible(true);
    }//GEN-LAST:event_songsActionPerformed

    private void artistsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artistsActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        QArtists artists = new QArtists();
        artists.setVisible(true);
    }//GEN-LAST:event_artistsActionPerformed

    private void FirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        QDisco disco = new QDisco();
        disco.setVisible(true);
    }//GEN-LAST:event_FirstActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Artist;
    private javax.swing.JButton First;
    private javax.swing.JButton Return;
    private javax.swing.JButton Return1;
    private javax.swing.JButton artists;
    private javax.swing.JLabel company;
    private javax.swing.JLabel engineer;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel mic;
    private javax.swing.JButton recordings;
    private javax.swing.JLabel song;
    private javax.swing.JButton songs;
    private javax.swing.JButton soundrecorder;
    // End of variables declaration//GEN-END:variables
}
