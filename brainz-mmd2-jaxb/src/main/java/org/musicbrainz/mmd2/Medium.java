//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.07.12 at 11:07:28 AM BST 
//


package org.musicbrainz.mmd2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}title" minOccurs="0"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}position" minOccurs="0"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}format" minOccurs="0"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}disc-list" minOccurs="0"/>
 *         &lt;group ref="{http://musicbrainz.org/ns/mmd-2.0#}def_track-list"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "title",
    "position",
    "format",
    "discList",
    "trackList"
})
@XmlRootElement(name = "medium")
public class Medium {

    protected String title;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger position;
    protected String format;
    @XmlElement(name = "disc-list")
    protected DiscList discList;
    @XmlElement(name = "track-list", required = true)
    protected Medium.TrackList trackList;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPosition(BigInteger value) {
        this.position = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the value of the discList property.
     * 
     * @return
     *     possible object is
     *     {@link DiscList }
     *     
     */
    public DiscList getDiscList() {
        return discList;
    }

    /**
     * Sets the value of the discList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscList }
     *     
     */
    public void setDiscList(DiscList value) {
        this.discList = value;
    }

    /**
     * Gets the value of the trackList property.
     * 
     * @return
     *     possible object is
     *     {@link Medium.TrackList }
     *     
     */
    public Medium.TrackList getTrackList() {
        return trackList;
    }

    /**
     * Sets the value of the trackList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Medium.TrackList }
     *     
     */
    public void setTrackList(Medium.TrackList value) {
        this.trackList = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;group ref="{http://musicbrainz.org/ns/mmd-2.0#}def_track" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;attGroup ref="{http://musicbrainz.org/ns/mmd-2.0#}def_list-attributes"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "defTrack","count","offset"
    })
    public static class TrackList {

        @XmlElement(name = "track")
        protected List<Medium.TrackList.Track> defTrack;
        @XmlAttribute
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger count;
        @XmlAttribute
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger offset;

        /**
         * Gets the value of the defTrack property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the defTrack property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDefTrack().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Medium.TrackList.Track }
         * 
         * 
         */
        public List<Medium.TrackList.Track> getDefTrack() {
            if (defTrack == null) {
                defTrack = new ArrayList<Medium.TrackList.Track>();
            }
            return this.defTrack;
        }

        /**
         * Gets the value of the count property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCount() {
            return count;
        }

        /**
         * Sets the value of the count property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCount(BigInteger value) {
            this.count = value;
        }

        /**
         * Gets the value of the offset property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOffset() {
            return offset;
        }

        /**
         * Sets the value of the offset property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOffset(BigInteger value) {
            this.offset = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}position" minOccurs="0"/>
         *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}number" minOccurs="0"/>
         *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}title" minOccurs="0"/>
         *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}length" minOccurs="0"/>
         *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}artist-credit" minOccurs="0"/>
         *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}recording" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "position",
            "number",
            "title",
            "length",
            "artistCredit",
            "recording"
        })
        public static class Track {

            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger position;
            protected String number;
            protected String title;
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger length;
            @XmlElement(name = "artist-credit")
            protected ArtistCredit artistCredit;
            protected Recording recording;

            /**
             * Gets the value of the position property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getPosition() {
                return position;
            }

            /**
             * Sets the value of the position property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setPosition(BigInteger value) {
                this.position = value;
            }

            /**
             * Gets the value of the number property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumber() {
                return number;
            }

            /**
             * Sets the value of the number property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumber(String value) {
                this.number = value;
            }

            /**
             * Gets the value of the title property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTitle() {
                return title;
            }

            /**
             * Sets the value of the title property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTitle(String value) {
                this.title = value;
            }

            /**
             * Gets the value of the length property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getLength() {
                return length;
            }

            /**
             * Sets the value of the length property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setLength(BigInteger value) {
                this.length = value;
            }

            /**
             * Gets the value of the artistCredit property.
             * 
             * @return
             *     possible object is
             *     {@link ArtistCredit }
             *     
             */
            public ArtistCredit getArtistCredit() {
                return artistCredit;
            }

            /**
             * Sets the value of the artistCredit property.
             * 
             * @param value
             *     allowed object is
             *     {@link ArtistCredit }
             *     
             */
            public void setArtistCredit(ArtistCredit value) {
                this.artistCredit = value;
            }

            /**
             * Gets the value of the recording property.
             * 
             * @return
             *     possible object is
             *     {@link Recording }
             *     
             */
            public Recording getRecording() {
                return recording;
            }

            /**
             * Sets the value of the recording property.
             * 
             * @param value
             *     allowed object is
             *     {@link Recording }
             *     
             */
            public void setRecording(Recording value) {
                this.recording = value;
            }

        }

    }

}
