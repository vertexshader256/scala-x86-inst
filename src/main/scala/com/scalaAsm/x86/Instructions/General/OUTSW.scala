package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Output String to Port
// Category: general/inoutstring

object OUTSW extends InstructionDefinition("OUTSW") with OUTSWImpl

trait OUTSWImpl {
  implicit object OUTSW_0 extends OUTSW._0 {
    val opcode: OneOpcode = 0x6F
    override def hasImplicitOperand = true
  }
}
