package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Convert Byte to Word
// Category: general/conver

trait CBW extends InstructionDefinition {
  val mnemonic = "CBW"
}

object CBW extends ZeroOperands[CBW] with CBWImpl

trait CBWImpl extends CBW {
  implicit object CBW_0 extends _0 {
    val opcode: OneOpcode = 0x98
        override def hasImplicitOperand = true
    val hasRMByte = false
  }
}
