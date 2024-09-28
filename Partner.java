public class Partner {

        String PartnerName;
        int PartnerID;

        public Partner(String partnerName, int partnerID) {
            PartnerName = partnerName;
            PartnerID = partnerID;
        }

        public String getPartnerName() {
            return PartnerName;
        }

        public int getPartnerID() {
            return PartnerID;
        }

        @Override
        public String toString() {
            return "Partner{" + "Partner Name :" + PartnerName + ", Partner ID :" + PartnerID + '}';
        }

    }


