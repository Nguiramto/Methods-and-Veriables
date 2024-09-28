import java.util.List;

public class Platform {

        String SystemName;
        List<Partner> partners;
        int SystemVersion;

        public Platform(String SystemName, List<Partner> partners, int SystemVersion) {
            this.SystemName = SystemName;
            this.partners = partners;
            this.SystemVersion = SystemVersion;

        }

        public void addPartner(Partner partner) {
            partners.add(partner);
        }

        public void removePartner(Partner partner) {
            partners.remove(partner);
        }
        public void listPartners() {
            if (partners.isEmpty()){
            } else {
                for (Partner partner : partners) {

                }
            }
        }






    }

