import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AddListingListener implements ActionListener {

    JournalFrame pbf;

    public AddListingListener(JournalFrame pbFrame) {
        pbf = pbFrame;
    }

    public void actionPerformed(ActionEvent aEvent) {
        AddListingDialog addDialog = new AddListingDialog(pbf);
        addDialog.setVisible(true);
    }
} 