using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CharacterEditor
{
    public partial class frmLoadCharacter : Form
    {
        public frmLoadCharacter()
        {
            InitializeComponent();
        }

        private void btnLoad_Click(object sender, EventArgs e)
        {
            lblCharacterInfo.Text = "";
            int counter = 0; //used for changing the description

            string[] description = { "Character Name: ", "HP: ", "MP: ", "Shield: ", "Armor: " };

            OpenFileDialog openFileDialog = new OpenFileDialog() ;              
            if (openFileDialog.ShowDialog() == DialogResult.OK)             //Select character file
            {
                System.IO.StreamReader sr = new System.IO.StreamReader(openFileDialog.FileName);

                for (int i = 0; i < description.Count(); i++) {         //Iterate through and match descriptions to values                    
                        lblCharacterInfo.Text += description[counter];      //Description
                        lblCharacterInfo.Text+=(sr.ReadLine())+"\r\n";      //Read next line
                        counter++;                                          //used for changing the description
                }           
                sr.Close();
            }
        }
        
        public void reloadComboBox()
        {
            string path = String.Format("{0}", Directory.GetParent(Environment.CurrentDirectory).Parent.FullName + "\\Characters\\");
            
            DirectoryInfo d = new DirectoryInfo(path);
            FileInfo[] Files = d.GetFiles();
            foreach (FileInfo file in Files)
            {
                cmbCharacterList.Items.Add(file.Name);
            }
            
        }

        private void cmbCharacterList_SelectedValueChanged(object sender, EventArgs e)
        {
            lblCharacterInfo.Text = "";
            int counter = 0; //used for changing the description

            string[] description = { "Character Name: ", "HP: ", "MP: ", "Shield: ", "Armor: " };

            string path = String.Format("{0}", Directory.GetParent(Environment.CurrentDirectory).Parent.FullName + "\\Characters\\");
               
            
            System.IO.StreamReader sr = new System.IO.StreamReader(String.Format("{0}{1}",path,cmbCharacterList.Text));

            for (int i = 0; i < description.Count(); i++)
                {         //Iterate through and match descriptions to values                    
                    lblCharacterInfo.Text += description[counter];      //Description
                    lblCharacterInfo.Text += (sr.ReadLine()) + "\r\n";      //Read next line
                    counter++;                                          //used for changing the description
                }
                sr.Close();
        }

    }
}
