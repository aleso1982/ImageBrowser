package imagebrowser.control;

import imagebrowser.control.ImageCommand;
import imagebrowser.ui.ImageViewer;

public class NextImageCommand extends ImageCommand {

    public NextImageCommand(ImageViewer viewer) {
        super(viewer);
    }

    @Override
    public void execute() {
        this.getViewer().showNextImage();
    }
    
}
