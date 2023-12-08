using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;

namespace CharacterEditor
{
    public partial class frmNewCharacter : Form
    {
        public frmNewCharacter()
        {
            
            InitializeComponent();
        }

        private void frmNewCharacter_Load(object sender, EventArgs e)
        {

        }

        private void btnSave_Click(object sender, EventArgs e)
        {
            string[] line = { txtCharacterName.Text, txtHP.Text, txtMP.Text, txtShield.Text, txtArmor.Text }; //Get text values and shove them in an array
            string path = String.Format("{0}{1}{2}", Directory.GetParent(Environment.CurrentDirectory).Parent.FullName + "\\Characters\\", txtCharacterName.Text, ".txt");
            System.IO.StreamWriter file = new System.IO.StreamWriter(path);  //write unique files to the desktop and attach .txt to the end

            for (int i = 0; i < line.Count(); i++)
            {
                file.WriteLine(line[i]);            //write the lines
            }            

            file.Close();
            frmLoadCharacter load = new frmLoadCharacter();
            load.reloadComboBox();
        }

        private void btnChangeSave_Click(object sender, EventArgs e)
        {
           
        }
    }
}
